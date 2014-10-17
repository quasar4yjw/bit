/* 형변환
 - 정의: 다른 데이터형의 임시 메모리를 만들고 값을 복사하는 것
 - 명시적 형변환 : 명령어를 사용하여 형변환을 지정하는 것
     (임시 메모리의 데이터형) 값
   예) int i = 10;
   byte b = (btye)i;
 - 암시적 형변환 : JVM이 내부 규칙에 따라 자동으로 형변환 하는 것
 */

package java01jw;

public class Test34 {

  public static void main(String[] args) {
        int i = 130;
        // 비록 상수 값이 4바이트 정수이지만, 
        // 메모리에 l-value에 넣을 수 있으면 허락한다.
        byte b = 10;
        
        //상수가 아닌 경우는 값을 l-value에 넣을 수 있다 하더라도
        //허락하지 않는다
        for (i=0; i<300; i++){
        byte b3 = (byte)i;
        System.out.println(b3);
        }
      
  }

}
