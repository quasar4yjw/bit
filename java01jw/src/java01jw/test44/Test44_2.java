package java01jw.test44;

public class Test44_2 {

  public static void main(String[] args) {
      Tank obj1 = new Tank();
      Soldier obj2 = new Soldier();
      Vulture obj3 = new Vulture();
      
      Vehicle obj4 = new Tank();
      Vehicle obj5 = new Vulture();
    //  Vehicle obj6 = new Soldier();
      
      Mover[] m = new Mover[10];
      Unit[] u = new Unit[10];
      
      // 퀴즈
      // 수퍼 클래스의 참조변수로 서브 클래스의 인스턴스를 가리킬 때는
      //비록 수퍼 클래스의 메서드를 호출하더라도,
      // 서브 클래스의 오버라이딩 메서드가 있다면, 오버라이딩 메서드가 호출된다.
      
      Vehicle v1 = new Tank();
      v1.move(0);
  }

}
