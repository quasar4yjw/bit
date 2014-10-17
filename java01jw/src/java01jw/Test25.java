/* 반복문
 * while (조건)  명령문;
 * while (조건) {...}
 * do 명령문; while(조건)
 * do {...} while(조건);
 * for (초기화명령문; 조건; 증가문) {...}
 * for (변수 : 배열이나 Collectio객체)
 */
package java01jw;

import java.util.ArrayList;
import java.util.Scanner;

public class Test25 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // ~ 1에서 20까지 출력하라 단, 3의 배수는 출력하지 말라
    // ~ while 문을 사용하라.
    // 3의 배수 검사
    // int age = Integer.parseInt(args[0]);
         int[] arr = new int[]{100, 90, 80};
         for (int value : arr) {
           System.out.println(value);
         }
         System.out.println("-------------");
         
         ArrayList list = new ArrayList();
         list.add("홍길");
         list.add(100);
         list.add(90);
         list.add(80);
         // Collection 객체에 저장된 값을 순차적으로 하나씩 꺼낸다.
         for(Object value : list){
           System.out.println(value);
           
         }
  }
}


