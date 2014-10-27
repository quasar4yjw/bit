/* Quiz 
 - 파일을 복제하는 기능을 구현하시오.
 - $ Test02 /home/bit/icon1.jpg(엔터)
 - => img1.jpg 파일을 복제하여 img1-01.jpg
 
 - 힌트: 출력은 FileOutputStream 클래스를 사용하라!
 */

package java02jw.test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

  public static void main(String[] args) {
    // 현재 파일의 위치는 프로젝트 디렉토리이다.
    FileInputStream in = null;
    FileOutputStream out = null;
    String[] arrr = new String[10];
    try{
      in = new FileInputStream(args[0]);
      arrr = args[0].split(".");
      
      System.out.println(arrr[0]);
      System.out.println(arrr[1]);
      System.out.println(arrr[2]);
      out = new FileOutputStream(arrr[0]+"-01."+arrr[1]);
      
      int index = args[0].lastIndexOf('.');
      
      int count = 0;
      int b = -1;
      //2. read()를 통해 1바이트 읽기
      // 리턴 타입이 int라 해서 4바이트를 읽는 것은 아니다.
      while ( (b = in.read()) != -1) {
        count++;
        out.write(b);
      }
      /* read() 중에 오류가 발생하면 close()를 호출도 못한다.
       * 그래서 자원을 해제하는 명령은 finally 블록에 두도록 하라!
       */
      //3. File이나 Databast, Socket 등의 자원은 사용한 다음
      //   명시적으로 해제해야 한다.
      //in.close();
      
      
      System.out.println("파일 크기는?" + count + "바이트!");
    } catch (FileNotFoundException ex){
      System.out.println("icon1.jpg 파일 못찾음");
    } catch (IOException ex) {
      System.out.println("읽기 오류!!!");

    } finally {
      //3. File이나 Databast, Socket 등의 자원은 사용한 다음
      //   명시적으로 해제해야 한다.
      // close() 하다가 예외 발생 시 ==> 아무것도 안한다.
      try {in.close();} catch (IOException ex) {}
      
          try{out.close();}catch (IOException e) {} 
    } 
  }

}
