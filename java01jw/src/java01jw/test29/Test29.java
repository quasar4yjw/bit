/* 캡슐화(encapsulation)
 - 클래스를 정의한 의도와 다르게 변수나 메서드를 사용할 경우
   오류가 발생하게 된다
 * 1) 변수에 무효한 값을 넣는다거나 
 * 2) 내부에서 호출할 메서드를 외부에서 직접 호출한다거나, 등
 * => 클래스 작성자가 의도한 대로만 사용하도록 접근을 제한하는 문법
 * => 최소한의 안전장치
 * 문법:
 *   [접근 제어자(access modifier)] 타입 변수명;
 *   [접근 제어자(access modifier)] 리턴타입 메서드명(...){...}
 *   접근제어자:
 *   1) private => 클래스 멤버만 접근 가능
 *   2) protected => 같은 패키지의 클래스에 접근 가능. 자식 클래스 접근 가능
 *   3) (default) => 같은 패키지의 클래스만 접근 가능
 *   4) public => 모두 접근 가능
 */
package java01jw.test29;

import java.util.Scanner;
// Calculator의 기능을 이용하여 다음

//단계6: result 변수의 외부 접근 차단 => 캡슐화
// =>Calculator 클래스를 정의하고, 계산과 관련된 기능을 분리

public class Test29 {
  

  public static void main(String[] args) {
    // Calculator.result = 0; 
    Calculator.plus(10);
    Calculator.plus(2);
    Calculator.multiple(7);
    Calculator.minus(4);
    Calculator.divide(2);
    
    System.out.println("결과는 =" + Calculator.getResult());
  }
 
}


