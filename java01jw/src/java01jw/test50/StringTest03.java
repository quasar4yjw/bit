package java01jw.test50;

public class StringTest03 {
  public static void main(String[] args) {
    String str1 = new String("Hello");
    String str2 = str1.intern();
    String str3 = "Hello";
    
    if (str1 == str2) System.out.println("true1");
    if (str1 == str3) System.out.println("true2");
    if (str2 == str3) System.out.println("true3");
  }
  
  
  public static void main01(String[] args) {
    // TODO Auto-generated method stub
       String str1 = "Hello";
       String str2 = str1.replace('l', 'x');
       String str3 = str1.replace("ell", "ohoho");
       String str4 = str1.replace('l', 'x');
       
       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str3);
       System.out.println(str4);
       
       if (str2 == str4) System.out.println("str2 == str4");
  }

}
