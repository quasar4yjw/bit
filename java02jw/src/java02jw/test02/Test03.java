/* Quiz
 - 예외 처리 강화
 파일을 읽을 때,
 1) 파일이 존재하지 않으면, 다음 문장 출력
    xxxx.xxx 파일이 존재하지 않습니다.
 2) 디렉토리라면 
    xxxx.xxx 는 파일이 아니라 디렉토리입니다.

 파일을 쓸 때,
 1) 파일이 이미 존재한다면,
    xxxx.xxx  파일이 이미 존재합니다. 덮어 쓰시겠습니까?(y/n)y
    xxxx.xxx 파일을 출력하였습니다.

 2) 파일이 존재하지 않는다면,
    xxxx.xxx 파일을 출력하였습니다.
 */
package java02jw.test02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Test03 {

  public static void main(String[] args)  {


    FileInputStream in = null;
    FileOutputStream out = null;
    String newFileName = "";
    String exFileName = "";
    String rideFileName = "";

    File file = new File(args[0]);
    File rideFile;

    try{
      int exIndex = args[0].lastIndexOf('/');
      //System.out.println(exIndex);
      exFileName = args[0].substring(exIndex+1);

      if (args[0].contains(".")) {

        int newIndex = args[0].lastIndexOf('.');

        newFileName = args[0].substring(0, newIndex)
            + "-01" + args[0].substring(newIndex);

        rideFileName = args[0].substring(exIndex+1, newIndex)
            + "-01" + args[0].substring(newIndex);
      
      }
      
      rideFile = new File(newFileName);



      Scanner scanner = new Scanner(System.in);
      if (rideFile.isFile()){
        System.out.println(rideFileName + 
            " 파일이 이미 존재합니다 덮어씌우겠습니까? Y/N"); 
        if (scanner.nextLine().equalsIgnoreCase("y")){

          in = new FileInputStream(args[0]); 
          out = new FileOutputStream(newFileName);

          int b = -1;

          while ((b = in.read()) != -1 ) {
            out.write(b);
          } 


          System.out.println(rideFileName +
              " 파일을 출력하였습니다.");
        }else{
          System.out.println(rideFileName +
              " 파일이 보존되었습니다");
        }
      } else {

        in = new FileInputStream(args[0]); 
        out = new FileOutputStream(newFileName);

        int b = -1;

        while ((b = in.read()) != -1 ) {
          out.write(b);
        } 

      }


    }
    catch (FileNotFoundException ex) {
      if (file.isDirectory()) System.out.println(args[0]+ " 는 파일이 아니라 디렉토리입니다.");
      else System.out.println(exFileName + " 파일이 존재하지 않습니다.");
    } catch (IOException ex) {   
      System.out.println("읽기 오류!");
    } finally {
      if(in!=null) try {in.close();} catch (IOException ex) {}
      if(out!=null) try {out.close();} catch (IOException ex) {}
    }
  }

}






