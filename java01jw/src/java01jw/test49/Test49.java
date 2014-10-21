package java01jw.test49;

import java.util.HashMap;




public class Test49 {
  
  public static void main(String[] args) {
    MyKey key1 = new MyKey("1234abcd", 100, 1255);
    MyKey key2 = new MyKey("1234abcd", 100, 1255);
    Integer key3 = new Integer(10);
    Integer key4 = new Integer(10);
    
    String key5 = new String("1234abcd");
    String key6 = new String("1234abcd");
    
    
    HashMap 냉장고2 = new HashMap();
    냉장고2.put(key1, "보약");
    
     System.out.println(냉장고2.get(key2));
     
     System.out.println("key1 == key2?" + (key1 == key2));
     System.out.println("key3 == key4?" + (key3 == key4));
     System.out.println("key5 == key6?" + (key5 == key6));
     System.out.println("==============");
     System.out.println(key1.hashCode());
     System.out.println(key2.hashCode());
     System.out.println(key3.hashCode());
     System.out.println(key4.hashCode());
     System.out.println(key5.hashCode());
     System.out.println(key6.hashCode());
     
     System.out.println("==============");
     System.out.println("key1.equals(key2)?" + key1.equals(key2));
     System.out.println("key3.equals(key4)?" + key3.equals(key4));
     System.out.println("key5.equals(key6)?" + key5.equals(key6));
     
  } 
  public static void main01(String[] args) {
    HashMap studentMap = new HashMap();
    studentMap.put("s001", new Student("홍길동", 10));
    studentMap.put("s002", new Student("임꺽정", 10));
    
    System.out.println(studentMap.get("s001"));
    System.out.println(studentMap.get("s002"));
  }
}
