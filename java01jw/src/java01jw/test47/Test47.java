package java01jw.test47;

public class Test47 {
  public static void main(String[] args) {
    //new ClassA();
    System.out.println(ClassA.value);
//   예상
//    10
//    ClassA : static 블록
//    ClassB : static 블록
//    "ClassB => ClassA.value = " 100
//    "ClassB => value = " 100
//    "ClassA : ClassB.value = " 100
//    "ClassA : value = " 100
  }
}
