/* 인스턴스 변수 값을 출력하기
 * 
 * 
 */
package java02jw.test02;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


  
class Score implements Serializable{
   
    /**
   * 
   */
  private static final long serialVersionUID = 1L;
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;
    
    public Score() {}
    public Score(String n, int k, int e, int m) {
      name = n; kor = k; eng = e; math = m;
      sum = k + e + m;
      average = sum / 3.0f;
    }
  }
public class Test14 {
  
 /* static class Score implements Serializable{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float average;
    
    public Score() {}
    public Score(String n, int k, int e, int m) {
      name = n; kor = k; eng = e; math = m;
      sum = k + e + m;
      average = sum / 3.0f;
    }
  }*/
  
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("test11_2.txt");
    ObjectOutputStream out2 = new ObjectOutputStream(out);
    
    Score obj = new Score("홍길동", 100, 90, 80);
    
    // 연습: obj 인스턴스 값 출력
    out2.writeObject(obj);
    
    // 닫을 때 꺼꾸로 닫는다.
    out2.close(); 
    out.close();
  }
  
 

}























