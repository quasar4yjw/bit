/* Inner class
 * => 무분별한 클래스 노출을 막기 위해
 * => 특정 클래스 안에서만 사용하는 클래스인 경우
 * 그 클래스 내부에서 정의함으로써
 * 외부에 노출되는 것을 막을 수 있다.
 * => 관리가 쉽다.
 * 
 * 클래스 종류
 * 1. 패키지 멤버 클래스 <= 일반적으로 만드는 클래스
 * 
 * 2. 중첩(inner) 클래스
 *  1) top level inner class
 *  2) member inner class
 *  3) local inner class
 *  4) anoymous inner class
 */
package java02jw.test13;

public class Test01 {
  // 1) top level inner class
  // static 으로 선언된 inner class
  // static 이기 때문에 다른 클래스에서도 사용할 수 있다.
  static class TopLevelInnerClass {
    // static 영역에서는 오로지 바깥 클래스의 static 멤버(변수, 메서드)만
    // 접근할 수 있다.
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
