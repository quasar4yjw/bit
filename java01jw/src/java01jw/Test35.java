/* 
 - 암시적 형변환 : JVM이 내부 규칙에 따라 자동으로 형변환 하는 것
 (
 */

package java01jw;

public class Test35 {

  public static void main(String[] args) {
    byte b = 10; 
    byte b2 = 10;//OK
    short s = 10; //OK
    char c = '가';
    char c2 = '나';//OK
    int i = 10;//OK
    long l = 10L; //error
    float f = 10.0f; //error
    double d = 10.0f; //error
    
    /*byte sum1 = b+s+c+i+l+f+d;
    byte sum2 = d+b+s+c+i+l;
    byte sum3 = b + b2;
    byte cc = c2;*/
    int cc = c+c2;
    System.out.println(c);
    System.out.println(cc);
   
    int x = 5;
    
      //  boolean firs = true + false;
  }

}
