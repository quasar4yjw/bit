package java02jw.test11.exam01;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

  public static void main(String[] args) throws Exception{
    System.out.println("서버와 연결 중...");

    // 서버와 연결할 소켓 생성
    // 서버와 연결이 이뤄지면 리턴
    Socket socket = new Socket("192.168.0.4", 8888);
    System.out.println("소켓 서버와 연결 성공!! @@@___@@@");

    // 소켓을 통해 읽고 쓰기 위한 입/출력 스트림 얻기
    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());

    //서버에 보낼 메시지를 사용자에게서 입력 받는다.
    String message = prompt();

    //서버에 메시지를 보낸다.
    out.println(message); // 서버가 데이터를 모두 읽을 때 까지
    //리턴하지 않는다 

    //서버가 보낸 메시지를 읽는다.
    String line = in.nextLine(); // 블로킹상태
    
    // 서버가 보낸 메시지를 출력
    System.out.println(line);

    in.close();
    out.close();
    socket.close();
  }

  private static String prompt() {

    System.out.println("> ");
    Scanner keyboard = new Scanner(System.in);
    String message = keyboard.nextLine();
    keyboard.close();

    return message;
  }

}
