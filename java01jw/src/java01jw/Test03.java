/*
main() : JVM이 클래스를 실행할 때 호출하는 함수
=> start entry
다음 소스의 규칙에 따라 작성하라!

자바 클래스 실행
- java -classpath [클래스 파일이 있는 경로] [클래스명]
만약 클래스가 특정 패키지에 소속된 멤버라면,
- java -classpath [패키지가 있는 경로] [패키지명.클래스명]
-classpath 대신 -cp 라고 해도 됨
패키지명.클래스명 = Fully Qualified Name(QName)
*
*/


package java01jw;

public class Test03 {
  public static void main(String[] args){
    //콘솔 창 출력
    System.out.print("Hello, World\n");
  }
}

