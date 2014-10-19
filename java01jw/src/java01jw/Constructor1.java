package java01jw;

public class Constructor1 {

  public static void main(String[] args) {
    Number num1 = new Number(33);
    Typetester t = new Typetester();
    t.printType(num1.getNumber());
    Number num2 = new Number(22);
    t.printType(num2.num);
  }
}
class Number { 
  public float num;
  public Number(long i)
  {
    num = i;
  }
  public double getNumber()
  {
    return num;
  }
}
class Typetester {
  void printType(byte x) {
    System.out.println(x + "(은)는 byte 타입입니다.");
  }
  void printType(int x) {
    System.out.println(x + "(은)는 int 타입입니다.");
  }
  void printType(float x) {
    System.out.println(x + "(은)는 float 타입입니다.");
  }
  void printType(double x) {
    System.out.println(x + "(은)는 double 타입입니다.");
  }
  void printType(char x) {
    System.out.println(x + "(은)는 char 타입입니다.");
  }
}
