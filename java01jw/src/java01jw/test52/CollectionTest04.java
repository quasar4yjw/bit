/* HashMap 사용
 * key-value 의 쌍으로 데이터를 관리
 * key로 사용할 클래스는 hashCode(), equals()를 재정의 해야함.
 * => 인스턴스가 다르더라도 값이 같으면 같은 해시코드를 리턴하도록 구현.
 * => 값인 같으면 equals(0가 true를 리턴하도록 구현.
 *  - 기존에 자바에서 제공하는 클래스들 중에서 String과 Wrapper 클래스들은
 *  hashCode() 와 equals()를 재정의했기 때문에 키로 사용할 수 있다.
 */
package java01jw.test52;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionTest04 {
  
  static class Score {
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
  }
  public static void main(String[] args) {
    HashMap<String, Score> map = new HashMap<String, Score>();
    map.put("1111", new Score("홍길동", 100, 100, 100));
    map.put("1111", new Score("꺽정이", 98, 98, 98));
    map.put("2222", new Score("관순이", 78, 78, 78));
    
    System.out.println(map.get("1111").name);
    System.out.println(map.get("2222").name);
    System.out.println(map.values());
    
   // System.out.println(map.get("11111").name);
    
    // 질문 : 키를 모른다 가정하고 map에 저장된 값을 모두 출력하시오.
    // 힌트: API문서를 보시오.
    Set<Map.Entry<String, Score>> kvSet = map.entrySet();
  }
  
}
