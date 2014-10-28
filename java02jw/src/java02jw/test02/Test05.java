/* File 기본 사용
*/
package java02jw.test02;

import java.io.File;

public class Test05 {

  public static void main(String[] args) throws Exception {
    File f = new File("../../bit/java01jw");
    
    // 결과:/home/bitbit/git/bit/java02jw/../../bit/java01jw
    System.out.println(f.getAbsolutePath());
    
    // 결과:/home/bitbit/git/bit/java01jw
    System.out.println(f.getCanonicalPath());
    
    // 결과:../../bit/java01jw
    System.out.println(f.getPath());
    
    // 결과:java01jw
    System.out.println(f.getName());
    
    // 결과:../../bit
    System.out.println(f.getParent());
    
    
  }

}
