/* Quiz
 - Test04 읽어들일파일명 출력할디렉토리명
 - 출력할 파일명이 다음과 같을 경우,
   예) Test04 img1.jpg aaa
 - aaa 폴더를 먼저 생성하고,
   그 폴더 아래에 읽어들인 파일(img1.jpg)를 출력한다.
 */
package java02jw.test02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {

  public static void main(String[] args)  {
    FileInputStream in = null;
    FileOutputStream out = null;
    File newDir = new File(args[1]);
    String newFileName = "";
    try{
      int dirIndex = args[0].lastIndexOf('/');
      
      newFileName = args[0].substring(0, dirIndex)
          + "/" + args[1] + args[0].substring(dirIndex);
      
      in = new FileInputStream(args[0]); 
      
      int index = args[0].lastIndexOf('.');
     
      newDir.mkdir();
      out = new FileOutputStream(newFileName);
      
      int b = 1;
      
      while ((b = in.read()) != -1 ) {
        out.write(b);
      } 
    } catch (FileNotFoundException ex) {
      System.out.println("img1.jpg 파일을 찾을 수 없습니다.");
    } catch (IOException ex) {   
      System.out.println("읽기 오류!");
          
    } finally {
      try {in.close();} catch (IOException ex) {}
      try {out.close();} catch (IOException ex) {}
    }
  }

}






