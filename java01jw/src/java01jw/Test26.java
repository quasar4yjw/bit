/* import
 - 다른 패키지에 있는 클래스를 사용하려면 반드시 패키지 이름 지정
 예) java.util.ArrayList;
 그러나 import 문을 사용하여 미리 클래스의 정보를 컴파일러에게 알려줌
 예) import java.util.Array;
 - 또는 클래스가 소속되어 있는 패키지 이름을 알려줄 수 있다.
 예) import java.util.*;
 가능한 클래스 이름까지 알려주는게 소스코드해석에 도움이 된다.
 */
package java01jw;

import java.util.ArrayList;
import java.util.Scanner;

public class Test26 {

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


