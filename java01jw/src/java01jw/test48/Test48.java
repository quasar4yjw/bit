package java01jw.test48;

public class Test48 {
  //hashCode() 테스트
  public static void main(String[] args) {
    Student s1 = new Student("홍길동", 10);
    Student s2 = new Student("홍길동3", 10);
    
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());

  }
  
  // toString() 테스트
  public static void main01(String[] args) {
    Student s1 = new Student("홍길동", 10);
    Student s2 = new Student("임꺽정", 10);
    
    /*System.out.println(s1.toString());
    System.out.println(s2.toString());*/
    
    System.out.println(s1);
    System.out.println(s2);
  }
}
