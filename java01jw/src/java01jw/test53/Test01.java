package java01jw.test53;

public class Test01 {
  public static void main(String[] args) {
    String[] data = {"길동", "꺽정", "관순", "중근", "봉길", "창호"};
    
    Iterator iterator = new Iterator(data);
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }          
}
