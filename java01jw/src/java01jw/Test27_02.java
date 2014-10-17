/* 메서드(함수)
 * 특정 기능을 수행하는 명령어를 묶어놓은 것.
 * 파라미터 : 기능을 수행하는 데 필요한 정보를 전달한다.
 * 리턴 값: 기능을 수행한 후 결과를 전달
 * 문법
 * 공개범위 스태틱여부 리턴값의 타입 메서드명(타입 변수명, 타입 변수명, ...) {
 *  return 값;
 *  }
 *  예) int plus(int i, int b){
 *   return i + b;
 *  }
 *  
 */
package java01jw;

import java.util.Scanner;

//주제: 사용자로부터 두 개의 값과 연산자를 입력받아 계산한 후
//그 결과를 출력한다.
//실행 예:
// $ 값1? 10
// $ 값2? 20
// $ 연산자? +
// $ 10 + 20 = 30 입니다.
//단계2: 메서드 도입 => 결과 출력을 별도의 메서드로 분리!

public class Test27_02 {
  //2) java.util.Scanner 객체를 사용하여 사용자로부터 값을 입력받는다.
  static void displayResult(
      int input, int input2, String input3, int result){
    
    
    System.out.printf(input + input3 + input2 + "=" + result + "입니다");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("값1?");
    int input = Integer.parseInt(sc.nextLine());
    
    System.out.println("값2?");
    int input2 = Integer.parseInt(sc.nextLine());
    
    System.out.println("연산자?");
    String input3 = sc.nextLine();
    int result = 0;
    switch(input3){
    
    case "+" : result = input + input2; break;
    case "-" : result = input - input2; break;
    case "*" : result = input * input2; break;
    case "/" : result = input / input2; break;
    }
    
    
    displayResult(input, input2, input3, result);
  
  }
  
}


