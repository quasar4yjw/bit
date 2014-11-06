/* ServerSocket 사용법
 * 
 */
package java02jw.test11.exam02;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
  static Scanner keyboard = new Scanner(System.in);

  static class ChatSkeleton implements Runnable {
    Socket socket;
    Scanner in;
    PrintStream out;

    public ChatSkeleton(Socket socket) throws Exception{
      this.socket = socket;
      in = new Scanner(socket.getInputStream());
      out = new PrintStream(socket.getOutputStream());
    }

    @Override
    public void run(){
      try{
        String line = null, message = null;
        while(true){
          line = in.nextLine();
          System.out.println(line);

          if (line.equalsIgnoreCase("quit")) {
            out.println("goodbye"); 
            break;
          }
          // 사용자에게서 문자열을 한 줄 입력받는다
          message = prompt();

          // 클라이언트로 보낸다.
          // 클라이언트에서 문자열을 모두 받을 때까지 리턴하지 않는다. == blocking
          // 입/출력은 항상 블로킹으로 다룬다. ==> Java non-bloking api 등장
          out.println(message);

        }
      } catch(Exception e){
        System.out.println("클라이언트와 통신 중 오류발생");
      } finally{

        try{in.close();} catch(Exception e) {}
        try{out.close();} catch(Exception e) {}

        try{socket.close();} catch(Exception e) {}
      }
    }
  }
  public static void main(String[] args) throws Exception{
    System.out.println("서버 소켓 생성");

    ServerSocket ss = new ServerSocket(8888);
    System.out.println("클라이언트 연결을 기다리는 중");
    while(true) {  // 클라이언트와 연결이 종료되면
      // 대기열의 다른 클라이언트와 연결한다.
      // 다만, 코딩한 바와 같이 순차적으로 실행한다.

      // 클라이언트와 통신을 담당할 객체 생성



      // 연결을 대기하고 있는 클라이언트들 중에서 하나 고르기
      // => 선택한 클라이언트와의 통신을 담당할 Socket 객체를 리턴


      Socket socket = ss.accept();
      System.out.println("대기 중에 있는 클라이언트와 연결 됨 @_@");
      
      
      new Thread(new ChatSkeleton(socket)).start();
      /*ChatSkeleton chat = new ChatSkeleton(socket);
      Thread t = new Thread(chat);
      t.start();*/
      
      // 소켓을 통해 읽고 쓰기 위한 입/출력 스트림 얻기


      // 클라이언트가 보낸 문자열 읽기
      // 클라이언트에서 한 줄의 문자열을 보내기 전까지 리턴하지 않는다.
      // "실행이 완료될 때 까지 리턴하지 않는다" == blocking
      String line = null, message = null;

    }
    //ss.close();

    //keyboard.close();


  }

  private static String prompt() {

    System.out.println("> ");
    String message = keyboard.nextLine();

    return message;
  }

}
