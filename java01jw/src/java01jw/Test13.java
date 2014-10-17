package java01jw;

import java.util.ArrayList;





public class Test13 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int kor,eng,math,sci,soc;
    //int scores[] = new int[5];       
    int[] scores = new int[5];
    scores = new int[3];
    scores[0]=100;
    scores[1]=90;
    scores[2]=80;
    //scores[3]=70; //Runtime Exception

    System.out.println("------------------------------");
    scores = new int[]{101, 91, 81};
    for (int i = 0; i < scores.length; i++){
      System.out.println(scores[i]);

      // 특수 배열 객체 생성
      ArrayList arr = new ArrayList();
      arr.add("홍길동");
      arr.add(100);
      arr.add(90);
      arr.add(80);
    }
  }   

}
