package java01jw.test44;

public class Soldier extends Mover {
   int attack;
   int level;
   @Override // 수퍼 클래스의 메서드 재정의 하는지 검사하라
   public void move(int dir) {
     System.out.println("뚜벅....뚜벅....");
     
   }
}
