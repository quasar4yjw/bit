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

public class Test21 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // ~ 1에서 20까지 출력하라 단, 3의 배수는 출력하지 말라
    // ~ while 문을 사용하라.
    // 3의 배수 검사
    // int age = Integer.parseInt(args[0]);

    int num;
    for(num=1; num<21; num++) {
      while(num%3==0); 
      System.out.println(num);

    }
  }
}


