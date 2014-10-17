/* 조건문
 * - 명령어의 흐름을 조건에 따라 분기하는 것
 * - if (조건) ~ else ~
 * - if (조건) {...} else {...}
 * - 프로그램 아규먼트로 나이를 입력 받아 
 * - 청소년, 청년 등의 여부를 출력하시오.
 * - 참고 문법
 * - 문자열을 숫자로 바꾸는 방법
 * String  s = "23";
 * int i = Integer.parseInt(s);
 */
package java01jw;

import java.util.Scanner;

public class Test18 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    // int age = Integer.parseInt(args[0]);
    System.out.println("당신의 나이가 어떻게 되는지 다음 보기에서 고르시오."
        + "\n 1) 10대"
        + "\n 2) 20대"
        + "\n 3) 30대"
        + "\n 4) 40대"
        + "\n 5) 50대"
        + "\n 6) 기타"
        + "\n 번호?");
    
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    switch(input){
    case "1": System.out.println("10대네?"); break;
    case "2": System.out.println("20대네?"); break;
    case "3": System.out.println("30대네?"); break;
    case "4": System.out.println("40대네?"); break;
    case "5": System.out.println("50대네?"); break;
    case "6": System.out.println("어르신이네?"); break;
    
    }
  }

}
