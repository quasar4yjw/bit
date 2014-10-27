// 바이너리 데이터 읽기

package java02jw.test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test01 {
  public static void main(String[] args) {
    // 현재 파일의 위치는 프로젝트 디렉토리이다.
    FileInputStream in = null;
    try{

      in = new FileInputStream("icon1.jpg");
      int count = 0;
      int b = -1;
      //2. read()를 통해 1바이트 읽기
      // 리턴 타입이 int라 해서 4바이트를 읽는 것은 아니다.
      while ( (b = in.read()) != -1) {
        count++;
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
    } 
  }
}
