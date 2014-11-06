/* JVM이 기본으로 생성하는 스레드 조사
 * 
 */


package java02jw.test12;

import javafx.scene.Parent;

public class Test01 {

  public static void main(String[] args) {
    // 현재 이 명령을 수행하는 스레드 알아내기
    Thread t =  Thread.currentThread();
    System.out.println("main() 호출 스레드: " + t.getName());

    // main 스레드가 소속되어 있는 스레드 그룹 알아내기
    ThreadGroup g = t.getThreadGroup();
    System.out.println("스레드가 소속된 그룹: " + g.getName());

    ThreadGroup p = g.getParent();
    System.out.println("그룹의 상위그룹: " + p.getName());

    //system 그룹이 최상위 그룹 : 없당
    //ThreadGroup superP = p.getParent();
    //System.out.println(superP.getName());
    ThreadGroup[] gr = new ThreadGroup[10];
    int count = 0;
    count = p.enumerate(gr, false);
    System.out.println(count);
    for(int i = 0; i < count; i++){
      System.out.println("----[" + gr[i].getName() + "]");
    }

    browseThreadInfo(p, 0);


  }
  
  
  public static void browseThreadInfo(ThreadGroup p, int level){
    displaySpaces(level);
    System.out.println("  @" + p.getName());
    
    
    ThreadGroup[] gr = new ThreadGroup[10];
    int count = 0;
    count = p.enumerate(gr, false);
    //System.out.println(count);
    for(int i = 0; i < count; i++){
      System.out.println("----[" + gr[i].getName() + "]");
      browseThreadInfo(gr[i], level+1);
    }
    
    Thread[] thrs = new Thread[10];
    int count2 = 0;

    count2 = p.enumerate(thrs, true);
    for(int i = 0; i < count2; i++){
      displaySpaces(level + 1);
      System.out.println("  ---->" + thrs[i].getName() + "]");
    }
  }

  public static void displaySpaces(int count){
    for (int i = 0; i < count; i++){
      System.out.println("  @@@");
    }
  }
}
