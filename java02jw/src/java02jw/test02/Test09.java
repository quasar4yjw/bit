package java02jw.test02;

import java.io.FileOutputStream;

public class Test09 {

  public static void main(String[] args) throws Exception{
    // TODO Auto-generated method stub
       FileOutputStream out = new FileOutputStream("test09.dat");
       char[] str = {'A', 'B', 'C', '가', '각', '간'};
       for (char c : str) {
         out.write(c);
       }
       out.close();
  }

}
