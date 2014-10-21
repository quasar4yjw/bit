/* Collection 다루기 1 - 배열을 사용하여 여러 객체에 주소 보관
 * 
 */

package java01jw.test51;

import java.util.Date;

public class CollectionTest01 {
  public static void main(String[] args) {
    String s = "Hello";
    Integer i = new Integer(20);
    StringBuffer sb = new StringBuffer("World");
    Date today = new Date();
    
    Object[] arr = {s, i, sb, today};
    
    for (Object obj : arr){
      System.out.println(obj);
    }
  }
}
