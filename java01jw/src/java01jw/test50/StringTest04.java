package java01jw.test50;

public class StringTest04 {

  public static void main(String[] args) {
      StringBuffer str1 = new StringBuffer("Hello");
      StringBuffer str2 = str1.replace(2, 4, "xx");
      
      System.out.println(str1);
      System.out.println(str2);
      
     if (str1 == str2) System.out.println("true1");
  }

}