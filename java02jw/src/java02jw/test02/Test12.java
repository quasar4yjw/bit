/* 데이터 프로세싱 스트림 클래스 (Data processing stream class)
 * 중간에서 데이터를 가공하는 역할
 * 자기 스스로 출력할 수 없다
 * 반드시 Data Sink Stream 클래스를 통해 출력한다.
 * -DataOutputStream
 * => 문자열과 기본타입 데이터를 출력할 때
 * 내부에서 바이트 배열로 만들어 다른 출력 스트림에게 넘긴다.
 * 
 * 
 */

package java02jw.test02;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test12 {
  public static void main(String[] args) throws Exception{
    // TODO Auto-generated method stub
    FileOutputStream out = new FileOutputStream("test11.dat");
    int kor = 100;
    int math = 90;
    int money = 145630;

    DataOutputStream dos = new DataOutputStream(out);
    dos.writeInt(kor);
    dos.writeInt(math);
    dos.writeInt(money);
    
    

    dos.close(); // 닫을 때 꺼꾸로 닫는다.
    out.close();
   
  }


  public static void main01(String[] args) throws Exception{
    // TODO Auto-generated method stub
    FileOutputStream out = new FileOutputStream("test11.dat");
    int kor = 100;
    int math = 90;
    int money = 145630;

    DataOutputStream dos = new DataOutputStream(out);
    dos.writeInt(kor);


    out.close();
    dos.close();
  }

}
