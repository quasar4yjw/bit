// 역할 : 계산기 역할 수행
package java01jw.test28;

public class Calculator {
 static int result;
 
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

