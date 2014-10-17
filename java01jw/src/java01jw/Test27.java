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

//단계4: 클래스 변수 도입 =>
// => 컴퓨트와 디스플레이리절트에서 공유할 값을 보관한다.


/* 클래스 변수
 * 클래스를 로딩할 때 준비되는 변수
 * Method Area 영역에 준비됨.
 * JVM이 실행을 종료할 때까지 유지
 * 
 * 로컬변수
 * 함수가 호출될 때 준비되는 변수
 * 함수 호출이 끝나면 제거된다.
 * 
 * 인스턴스 변수
 * 인스턴스가 생성될 때 준비되는 변수
 * Heap 영역에 준비됨.
 * 가비지 컬렉터에 의해 해제되기 전까지 존재한다.
 * 
 */
public class Test27 {
  
  static int v1;
  static int v2;
  static String op;
  static int result;
  
  
  //2) java.util.Scanner 객체를 사용하여 사용자로부터 값을 입력받는다.
  static void displayResult(){


    System.out.printf(v1 + op + v2 + "=" + result + "입니다");
  }
  static int compute(){
    switch(op){

    case "+" : return v1 + v2;
    case "-" : return v1 - v2;
    case "*" : return v1 * v2;
    case "/" : return v1 / v2;
    default : return 0;
    }
   
    //return 0;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("값1?");
    v1 = Integer.parseInt(sc.nextLine());

    System.out.println("값2?");
    v2 = Integer.parseInt(sc.nextLine());

    System.out.println("연산자?");
    op = sc.nextLine();
    
    result = compute();



    displayResult();

  }

}


