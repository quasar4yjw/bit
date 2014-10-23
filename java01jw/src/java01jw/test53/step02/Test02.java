package java01jw.test53.step02;

public class Test02 {
  public static void main(String[] args) {
    String[] data = {"길동", "꺽정", "관순", "중근", "봉길", "창호"};
    
    Iterator iterator = new Iterator(args);
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }          
}
