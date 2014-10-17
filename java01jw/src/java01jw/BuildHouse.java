//다음 소스에서 빈칸에 들어갈 말을 채우시오.
package java01jw;
class MyHouse {
  int height;
  MyHouse() {
    System.out.println("다른 집도 지으려고 새로 벽돌을 쌓았어요!");
    height = 2;
  }
  MyHouse(int i) {
    System.out.println(i + "m 높이의 집1 을 짓는중이에요!");
    height = i;
  }
  void displayHeight() {
    System.out.println("이 집의 높이는 " + height
        + "m 네요!!!");
  }
  void displayHeight(String s) {
    System.out.println(s + ">>> 높이 : "
        + height + " m 입니다 <<<");
  }
}
public class BuildHouse {
  public static void main(String[] args) {
    MyHouse build = new MyHouse(5);
    build.displayHeight();
    build.displayHeight("인스턴트 메서드를 오버로딩했어요!");
    MyHouse build2 = new MyHouse();
    build2.displayHeight();
    build2.displayHeight("오버로딩한 생성자의 인스턴트 메서드를 오버로딩했어요.");
  }
}
