/* 반복문
 * while (조건)  명령문;
 * while (조건) {...}
 * do 명령문; while(조건)
 * do {...} while(조건);
 * for (초기화명령문; 조건; 증가문) {...}
 * for (
 */
package java01jw;

import java.util.Scanner;

public class Test24 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // ~ 1에서 20까지 출력하라 단, 3의 배수는 출력하지 말라
    // ~ while 문을 사용하라.
    // 3의 배수 검사
    // int age = Integer.parseInt(args[0]);
    long startMillisSec = System.currentTimeMillis();
    
    for (int i = 0; i <= 100; i += 4){
     
      
        System.out.print(i + ", ");
        if (i%20 == 0) {
          System.out.println();
          if (i%60 == 0) {
            System.out.print("@");
          }
        }
      
    }
    long endMillisSec = System.currentTimeMillis();
    System.out.println(endMillisSec);
    System.out.println(startMillisSec);
    System.out.println(endMillisSec - startMillisSec);
  }
}


