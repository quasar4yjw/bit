package java01jw.test47;

public class ClassB {
  static int value = 10;
  
  static {
    System.out.println("ClassB => static 블록");
    ClassA.value = 100;
    System.out.println("ClassB => ClassA.value = " + ClassA.value);
    System.out.println("ClassB => value = " + value);
  }
}
