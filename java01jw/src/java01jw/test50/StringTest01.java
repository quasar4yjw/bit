package java01jw.test50;

public class StringTest01 {
  public static void main(String[] args) {
     String str1 = new String("Hello");
     String str2 = str1;
     String str3 = new String("Hello");
     
     if (str1.equals(str3)) System.out.println("true"); 
  }
}
