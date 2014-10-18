package java01jw;

public class Constructor1 {
 

  public static void main(String[] args) {
    // TODO Auto-generated method stub
        Number num1 = new Number();
        System.out.println(num1.getNumber());
        
        Number num2 = new Number();
        System.out.println(num2.num);
  }

}


class Number {
  public int num;
  public Number()
  {
    num = 10;
    System.out.println("생성자 호출!");
    
  }
  public int getNumber()
  {
    return num;
  }
  
}

