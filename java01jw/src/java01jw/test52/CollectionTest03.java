package java01jw.test52;

import java.util.HashSet;

public class CollectionTest03 {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    
    System.out.println("s1:" + s1.hashCode());
    System.out.println("s2:" + s2.hashCode());
    System.out.println("s3:" + s3.hashCode());
    System.out.println("-----------");
    HashSet<String> set = new HashSet<String>();
    set.add(s1);
    set.add(s2);
    set.add(s3);
    set.add("오호라");
    
    for(String value : set){
      System.out.println(value);
    }
  }
}
