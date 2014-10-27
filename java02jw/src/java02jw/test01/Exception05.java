/* 예외 처리의 의미
 1) 리턴 값으로 예외 상황을 알릴 수 없는 경우
 2) 리턴 값으로 예외 상황을 알린다 하더라도 
     실제 연산 결과와 충돌이 일어 날 때.
 3) 작업 코드와 오류 처리 코드를 분리 => 코드 가독성을 높이다.
 ★ 4) 오류가 발생했을 때 시스템을 종료하지 않고 계속 수행할 수 있게 한다.
 
 */

package java02jw.test01;

import java.util.Scanner;

public class Exception05 {

  public static int divide(int a, int b) /*throws Exception*/{
    if (b == 0)
      /*throw new Exception("0으로 나누지 마세요.");*/
      throw new Error("0으로 나누지 마세요.");
    return a / b;
  }

  //그러나 굳이 처리하고자 한다면 해도 된당.
  // Error 계열의 예외도 try... catch...로 잡을 수 있다.
  
  // 0으로 나누면 예외가 발생, 시스템 멈춤
  public static void main01(String[] args) {
   
      Scanner scanner = new Scanner(System.in);
      int a, b;
      
      while(true){
         System.out.println("a?");
         a = Integer.parseInt(scanner.nextLine());
         
         System.out.println("b?");
         b = Integer.parseInt(scanner.nextLine());
         
         System.out.println("결과(a/b):" + divide(a, b));
         
         System.out.println(" 계속할꺼야 ?(Y/N)");
         if (scanner.nextLine().equals("N"))
           break;
         
      }
      scanner.close();
     
  }
  
  //개선안 => 0으로 나눠서 예외가 발생하면 간단히 처리하고 계속실행
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int a, b;
    
    while(true){
       System.out.println("a?");
       a = Integer.parseInt(scanner.nextLine());
       
       System.out.println("b?");
       b = Integer.parseInt(scanner.nextLine());
       
       
       try { // 예외가 발생하더라도 간단히 처리하고 계속 다음 명령을 수행.
       System.out.println("결과(a/b):" + divide(a, b));
       } catch (Error ex) {
         System.out.println(ex.getMessage());
       }
         
         
       System.out.println(" 계속할꺼야 ?(Y/N)");
       if (scanner.nextLine().equals("N"))
         break;
       
    }
    scanner.close();
   
}

}
