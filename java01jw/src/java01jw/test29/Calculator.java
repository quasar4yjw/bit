// 역할 : 계산기 역할 수행
package java01jw.test29;

public class Calculator {
  //클래스 멤버만 접근 가능하도록 제한
  private static int result;
 
  
  static int getResult(){
    return result;
  }
  
 static void plus(int value){
   result += value;
 }
 static void minus(int value){
   result -= value;
 }
 static void multiple(int value){
   result *= value;
 }
 static void divide(int value){
   result /= value;
 }
}

