/* 재귀 호출의 이해 
 * 
 */
package java02jw.test02;

public class Test06_Ep02 {
  static int num;
  //함수 호출 통해 1...50까지 더하라
  public static void main(String[] args) {
    
    displayNo(1);
  }
  
  public static void displayNo(int no) {
    num += no;
    
    if (no == 50){
      System.out.println(num);
      return;
    }
    else
      displayNo(++no);
    
  }
  

}
