/* Object 클래스
 - 자바 최상위 클래스이다.
 - 수퍼 클래스를 지정하지 않으면 자바 컴파일러는
   자동으로 Object를 상속받게 한다.
 */

package java01jw.test48;

public class Student/* extends Object */{
  String name;
  int age;
  
  public Student(String name, int age){
    this.name = name;
    this.age = age;
  }
  @Override
  public String toString(){
    return name + "," + age;
  }
}
