package NewMission;

import java.util.ArrayList;
import java.util.Scanner;

public class ExcuteClass {
  static String command;
  static String[] studentInfo;
  
  public static void main(String[] args) {
    ArrayList<String[]> list = new ArrayList();
    System.out.print("명령> ");
    Scanner scanner = new Scanner(System.in);
    if((command = scanner.nextLine()).substring(0, 3).equalsIgnoreCase("add")){
      
      list.add(command.substring(4).split(" "));
      /*arrayContent = */
      System.out.println("저장되었습니다.");
      System.out.println(list.get(0)[0]);
      System.out.println(list.get(0)[1]);
      System.out.println(list.get(0)[2]);
      System.out.println(list.get(0)[3]);
      System.out.print("0 "+ list.get(0)[0] +" "+ list.get(0)[1] + list.get(0)[2] + list.get(0)[3]);
      
    }//if
    
    
  }
}
