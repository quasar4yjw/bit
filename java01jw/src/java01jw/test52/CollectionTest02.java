/*Collection API ; 목록 데이터를 다루는 클래스 라이브러리
 *  모든 Collection 관련 클래스들은 Collection 규칙에 따라서 클래스를 만든다.
 *  1.List : 데이터 중복 허용!
 *  2.Set : 데이터 중복 불가!(집합)
 *  3.Map : key-value 쌍으로 데이터 관리!
 */
package java01jw.test52;

import java.util.ArrayList;
import java.util.Iterator;

/* 제네릭(Generic) 사용
 - 클래스에서 다룰 데이터의 타입을 지정하는 방법.
 - 지정된 타입이 아닌 데이터에 대해서는 오류 발생 시킴.

 */
public class CollectionTest02 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("Hello");
    list.add("Hello");
    list.add(new String("Hello"));
    list.add(10); // autoboxing

    ArrayList<String> list2 = new ArrayList<String>();
    list2.add("Hello");
    list2.add(new String("Hello"));
    // 오류 : list2.add(new Integer(10));

    /* local inner class 
     * => 특정 메서드에서만 사용할 클래스라면 그 메서드에 선언하라.
     */
    class Score {
      String name;
      int kor;
      int eng;
      int math;
      public Score(String n, int k, int e, int m){
        name = n;
        kor = k;
        eng = e;
        math = m;
      }
    }//class Score

    ArrayList list3 = new ArrayList();
    list3.add(new Score("길동이", 100, 100, 100));
    list3.add(new Score("꺽정이", 90, 90, 90));
    //list3.add("Hellooo");
    // 질문 : 목록에서 Score 객체를 꺼내 이름을 출력하라!
    // 어떤 걸 사용해도 상관없엉 너맘대로
    Iterator<Score> iterator = list3.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next().name);
    }
    //Score score = null;
    for (int i = 0; i < list3.size(); i++){
      //score = list3.get(i);
      System.out.println(((Score)list3.get(i)).name);     
    }
    
    
    System.out.println("------list4-----------");
    ArrayList<Score> list4 = new ArrayList<Score>();
    list4.add(new Score("길동이", 100, 100, 100));
    list4.add(new Score("꺽정이", 90, 90, 90));
    //list4.add("Hell");
    
    // 질문 : 목록에서 Score 객체를 꺼내 이름을 출력하라!
    // 어떤 걸 사용해도 상관없엉 너맘대로
    //Score score = null;
    for (int i = 0; i < list4.size(); i++){
      //score = list3.get(i);
      System.out.println(list4.get(i).name);     
    }
  }
}
