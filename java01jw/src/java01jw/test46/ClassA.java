package java01jw.test46;

public class ClassA {
 int i = 1;
 int j = 2;
 {
   System.out.println("인스턴스 블록1");
   i = 100;
   j = 200;
 }
 
 public ClassA(){
   System.out.println("생성자 호출");
   i = 10;
   j = 20;
   
 }
 
 {
   System.out.println("인스턴스 블록2");
   i = 1000;
   j = 2000;
 }
}
