package java01jw.test44;

abstract public class Mover extends Unit{

   public static final int NORTH = 0;
   public static final int EAST = 3;
   public static final int WEST = 9;
   public static final int SOUTH = 6;
   

  // 여기서 열심히 코딩해봐야
  // 어차피 서브 클래스에서 다시 작성해야 함.
  // 왜냐면 탱크와 벌처와 군인의 움직임 공식이 다르기 때문.
  // 이렇게 수퍼 클래스에서 기능을 정의할 수 없는 것
  // 아니, 기능을 정의하되, 구연할 수 없는 경우
  // 해당 메서드를 추상 메서드로 만들어라
 abstract public void move(int direction);
}
