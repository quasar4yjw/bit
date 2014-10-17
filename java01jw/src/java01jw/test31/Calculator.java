// 역할 : 계산기 역할 수행
package java01jw.test31;

public class Calculator {
  //인스턴스 변수 선언 => static 제거
  // => 인스턴스 변수는 클래스 로딩할 때 준비앙댐
  // 별도의 명령을 내려야 준비함
  // 명령 내리는 법? new Calculator();
  // 해석 : JVM! 듣거라 Calculator 클래스에 선언된
  // 인스턴스 변수를 Heap 메모리에 준비해
  // 그리고 그 시작주소 리턴해줘
  
  private int result;
 
  //인스턴스 변수에 값을 사용하려면 그 인스턴스의 시작 주소를 알아야한다
  // 따라서, 메서드의 파라미터에 인스턴스 주소를 넘겨줘라
  
  int getResult(){
    return this.result;
  }
  
 void plus(/* Calculator this, */ int value){
   this.result += value;
   //this 변수는 내부에 숨겨진 변수이다.
   //메서드를 호출할 때 사용한 인스턴스의 주소를 보관한다.
   //만약, 인스턴스 변수를 사용할 때 this를 붙이지 않으면
   //컴파일러가 자동으로 있다고 가정하고 컴파일함.
 }
 void minus(int value){
   this.result -= value;
 }
 void multiple(int value){
   this.result *= value;
 }
 void divide(int value){
   this.result /= value;
 }
}

