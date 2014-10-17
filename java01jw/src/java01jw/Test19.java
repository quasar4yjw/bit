/* switch
 * 특정 값에 따라 명령어의 실행을 분기할 때 사용하는 문법으로써
 * 문법은 switch(4바이트 이하 정수값, byte, short, int, char) {
 * 
 */
package java01jw;

import java.util.Scanner;

public class Test19 {

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
