package java02jw.test02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Test16 {
  public static void main(String[] args) throws Exception{
    FileInputStream in = new FileInputStream("/home/bitbit/Test.pdf");
    System.out.println("dd");
    BufferedInputStream in2 = new BufferedInputStream(in);
    int b;
    long start = System.currentTimeMillis();
    while((b= in2.read()) != -1){
      
    }
    long end = System.currentTimeMillis();
    
    System.out.println(end - start);
    in2.close();
    in.close();
  }
  
  public static void main02(String[] args) throws Exception{
    FileInputStream in = new FileInputStream("/home/bitbit/Test.pdf");
    System.out.println("dd");
    byte[] buf = new byte[512];
    int len = 0;
    long start = System.currentTimeMillis();
    while((len = in.read(buf)) != -1){
      
    }
    long end = System.currentTimeMillis();
    
    System.out.println(end - start);
    in.close();
  }
  
  
  public static void main01(String[] args) throws Exception{
    FileInputStream in = new FileInputStream("/home/bitbit/Test.pdf");
    System.out.println("dd");
    int b;
    long start = System.currentTimeMillis();
    while((b = in.read()) != -1){
      
    }
    long end = System.currentTimeMillis();
    
    System.out.println(end - start);
    in.close();
  }

}
