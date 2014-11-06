package java02jw.test13;



//static inner 클래스 임포트
//방법1. 정확하게 모든 정보를 지정
// 예) 패키지명.패키지명.바깥클래스명.중첩클래스명;
//import java02jw.test13.Test01.TopLevelInnerClass;

//방법2. import static 구문을 사용하여 static 멤버를 모두 지정
import static java02jw.test13.Test01.*;

public class InnerClassUser {

  public static void main(String[] args) {
    //1. top level inner class 사용
    //방법1.
    Test01.TopLevelInnerClass p 
    = new Test01.TopLevelInnerClass();
    
    //방법2.
    // static 클래스를 import 하여 사용하기
    // import java02jw.test13.Test01.TopLevelInnerClass;
    TopLevelInnerClass p2 = new TopLevelInnerClass();
    
  }

}
