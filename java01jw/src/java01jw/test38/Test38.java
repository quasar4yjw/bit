package java01jw.test38;

public class Test38 {

  public static void main(String[] args) {

  Score s = new Score("홍길동", 100, 90, 80);
  
  
  System.out.println("이름: " + s.name);
  System.out.println("국어: " + s.kor);
  System.out.println("영어: " + s.eng);
  System.out.println("수학: " + s.math);
  System.out.println("합계: " + s.sum);
  System.out.println("평균: " + s.average);
  }
}
