/* 사용자 정의 데이터 타입
 * 자바에서 제공하는 데이터형이 아니라 개발자가 프로젝트에 맞춰서
 * 필요한 데이터형을 정의하는 것.
 */
package java01jw.test38;

// Score는 어떤 데이터 타입이냐?
//학생의 이름과 국어 영어 수학 점수들을 평균 합계를 저장하는
//메모리의 데이터형이다.
public class Score {
  String name; // 용어: 인스턴스 변수, 속성(attribute)
  int kor;
  int eng;
  int math;
  int sum;
  float average;
public Score(String name, int kor, int eng, int math) {
  this.name = name;
  this.kor = kor;
  this.eng = eng;
  this.math = math;
  compute();
}

     
     public void compute() {
       this.sum = this.kor + this.eng + this.math;
       this.average = this.sum/3f;
     }
   

}
