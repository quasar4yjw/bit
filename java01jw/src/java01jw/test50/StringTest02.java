package java01jw.test50;

class A {
  static String str1 = "Hello";
  static String str2 = "Hello";
}

class B {
  static String str1 = "Hello";
  static String str2 = "Hello";
}
public class StringTest02 {
  static String str1 = "Hello";
  static String str2 = "Hello";

  public static void main1(String[] args) {
    if (str1 == str2) System.out.println("true1");
    if (A.str1 == A.str2) System.out.println("true2");
    if (B.str1 == B.str2) System.out.println("true3");
    
    if (str1 == A.str2) System.out.println("true4");
    if (A.str1 == B.str2) System.out.println("true5");
  }
  
  public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "Hello";
            String str3 = new String("Hello");
            int i = 10;
            int x = 10;
            
            if (str1 == str3) System.out.println("true3");
            if (x == i) System.out.println("true5");
  }

}
