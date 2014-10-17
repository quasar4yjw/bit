/* 클래스?
 * 역할에 따라 메서드(함수)와 변수를 정의한 것 묶어놓은 것.
 * 
 */
package java01jw.test28;

import java.util.Scanner;
// Calculator의 기능을 이용하여 다음

//단계5: 클래스 분리
// =>Calculator 클래스를 정의하고, 계산과 관련된 기능을 분리

public class Test28 {
  

  public static void main(String[] args) {
    // Calculator.result = 0; 
    Calculator.plus(10);
    Calculator.plus(2);
    Calculator.multiple(7);
    Calculator.minus(4);
    Calculator.divide(2);
    
    System.out.println("결과는 =" + Calculator.result);
  }
 
}


