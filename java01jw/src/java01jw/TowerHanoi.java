//다음 소스에서 빈칸에 들어갈 말을 채우시오.
package java01jw;
public class TowerHanoi {
  public static void main(String[] args) {
    int nDisks = 3;
    doTowers(nDisks, "왼쪽꽂이", "가운데꽂이", "오른쪽꽂이");
  }
  static void doTowers(int topN, String from,
      String inter, String to) {
    if (topN == 1){
      System.out.println("1번째 작은링이 " +
          from + " 에서 " + to +"로 옮겨졌어요.");
    }else {
      doTowers(topN - 1, from, to, inter);
      System.out.println(
          + topN +"번째 작은링이 " + from + " 에서 " + to + "로 옮겨졌어요.");
      doTowers(topN - 1, inter, from, to);
    }
  }
}

/*do(3,a,b,c){

  do(2,a,c,b); {

    do(1,a,b,c) {
      print  1 a to c
    }
    print 2 a to b
    do(1,c,a,b){
      print 1 c to b
    }
  }
  print 3 a to c
  do(2,b,a,c){
    do(1,b,c,a){
      print 1 b to a
    } print 2 b to c
    do(1,a,b,c){
      print 1 a to c  
    }

  }
}*/