/* static 블록
 * 
 */
package java01jw.test45;

public class ClassA {
  static int value = 100;
  static {
    System.out.println("ClassA의 static 블록 실행");
    value = 200;
  }
  
  static {
    System.out.println("스태틱 블록이 여러 개일 경우 순차적으로 실행.");
  }
}

