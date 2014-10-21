package java01jw.test45;

public class Test45 {

  public static void main(String[] args) {
    // 참조 변수를 선언할 때는 클래스가 로딩되지 않는다.
      ClassA obj1;
    
      obj1 = new ClassA();
      
      System.out.println(ClassA.value);
      //obj1 = new ClassA();
  }

}
