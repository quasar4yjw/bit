/* 인스턴스 메서드
 인스턴스 주소를 줘야지만 호출할 수 있는 메서드
 문법: 인스턴스주소.메서드();
 해설:
 인스턴스 메서드를 호출할 때, 인스턴스의 주소를 앞에 준다.
 JVM은 인스턴스 변수가 어떤 클래스의 변수인지 알아낸다.
 알아낸 클래스의 메서드를 호출
 이 때 메서드 앞에 준 인스턴스의 주소를 메서드에 넘긴다.
 메서드는 JVM이 호출할 때 넘겨준 인스턴스 주소를 내부 비밀 변수에 저장한다.
 비밀변수의 이름은 this.
 */
package java01jw.test31;

import java.util.Scanner;
// Calculator의 기능을 이용하여 다음

//단계7: result 변수를 개별적으로 유지 => 인스턴스 변수
// =>Calculator 클래스를 정의하고, 계산과 관련된 기능을 분리

public class Test31 {
  

  public static void main(String[] args) {
    // Calculator.result = 0;
    // Calculator 클래스의 명령에 따라 준비된 메모리를 인스턴스
    // 그 인스턴스 메모리의 주소를 저장하는 변수를 레퍼런스
    // 주소 c1 = new Calculator();
    Calculator c1  = new Calculator();
    Calculator c2  = new Calculator();
    
    c1.plus( 10);
    c2.plus( 20);
    
    c1.plus( 2);
    c2.multiple( 3);
    
    c1.multiple( 7);
    c2.plus( 76);
    
    c1.minus( 4);
    c2.minus( 5);
    
    c1.divide( 2);
    
    System.out.println("c1 결과는 =" + c1.getResult());
    
    System.out.println("c2 결과는 =" + c2.getResult());
  }
 
}


