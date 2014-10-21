package java01jw.test46;

public class ClassB extends ClassA{
  int x = 10;
  {
    System.out.println("ClassB의 인스턴스 블록");
    
  }
  
  public ClassB(){
    System.out.println("ClassB의 생성자");
    x = 20;
  }
  {
    System.out.println("ClassB의 인스턴스 블록2");
    
  }
}
