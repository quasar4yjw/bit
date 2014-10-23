package java01jw.test53.step04;

import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Properties;

public class Test04 {
  public static void main(String[] args) throws Exception {
    String iteratorClassName = System.getProperty("iterator");
    
    // 클래스 이름(패키지명 포함)으로 객체 생성하기
    // 1) 클래스를 로딩하라.
    Class clazz = Class.forName(iteratorClassName);
    
    // 2) Class 객체를 사용하여 인스턴스 생성
    Iterator iterator = (Iterator)clazz.newInstance();
    
    // 3) Iterator를 사용하기 전에 필요한 값을 설정한다.
    iterator.setList(args);
    
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("==@_@==");
    Method[] methods = clazz.getMethods();
    for (Method method : methods) {
      System.out.println(method.getName()); // public method info
      
      // 안타깝게도 다른 Iterator 사용불가
      // 다음 단계를 보기 바람.
    }
  }

  public static void main2(String[] args) {
    // -D 옵션으로 전달된 값을 꺼낼 때,
    // System.getProperty(파라미터명) 사용하라!
     System.out.println(System.getProperty("iterator"));   
    EvenIterator iterator = new EvenIterator(args);


    /* Iterator 가 바뀌더라도 다음 코드는 변경할 필요가 없다 
     * 이것이 Iterator 설계 특징이다.
     * 즉, 꺼내는 방식에 상관없이 사용하는 쪽에서는
     * 일관된 메서드를 사용할 수 있다는 점이다.
     * 
     * 이렇게 꺼내는 방법을 별도의 객체로 분리함으로써
     * 실행할 때 유연해진다.
     */
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }          
}
