/* 인스턴스 변수
 * 값을 개별적으로 관리할 필요가 있을 때 사용.
 */
package java01jw.test30;

import java.util.Scanner;
// Calculator의 기능을 이용하여 다음

//단계7: result 변수를 개별적으로 유지 => 인스턴스 변수
// =>Calculator 클래스를 정의하고, 계산과 관련된 기능을 분리

public class Test30 {
  

  public static void main(String[] args) {
    // Calculator.result = 0;
    // Calculator 클래스의 명령에 따라 준비된 메모리를 인스턴스
    // 그 인스턴스 메모리의 주소를 저장하는 변수를 레퍼런스
    Calculator c1  = new Calculator();
    Calculator c2  = new Calculator();
    
    Calculator.plus(c1, 10);
    Calculator.plus(c2, 20);
    
    Calculator.plus(c1, 2);
    Calculator.multiple(c2, 3);
    
    Calculator.multiple(c1, 7);
    Calculator.plus(c2, 76);
    
    Calculator.minus(c1, 4);
    Calculator.minus(c2, 5);
    
    Calculator.divide(c1, 2);
    
    System.out.println("c1 결과는 =" + Calculator.getResult(c1));
    
    System.out.println("c2 결과는 =" + Calculator.getResult(c2));
  }
 
}


