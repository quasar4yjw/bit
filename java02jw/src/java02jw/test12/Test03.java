package java02jw.test12;

import java.util.Date;

public class Test03 {
  static class MyAlarm implements Runnable {
    @Override
    public void run() {
      int count = 0;
      while(true){
        if(++count == 10) break;

        // TODO Auto-generated method stub
        Date today = new Date();
        System.out.println("\n"+ today);
        try{
          Thread.currentThread().sleep(1000);
        }
        catch(Exception e){

        }
      }
    }
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    new Thread(new MyAlarm()).start();
    for(int i = 0; i < 1000000000; i++){
      double d1 = 3.14159;
      double d2 = 123.345;
      d1 = d1 / d2;
      if((i%10000) == 0)
        System.out.print(".");
    }
  }

}
