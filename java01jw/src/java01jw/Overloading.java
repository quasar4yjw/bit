package java01jw;


class OverloadingC{  
  void sum(int a,long b){System.out.println("a method invoked");}  
  void sum(long a,int b){System.out.println("b method invoked");} 
}
public class Overloading {


  public static void main(String args[]){  
    OverloadingC obj=new OverloadingC();  
    obj.sum(20,20l);//now ambiguity  
  }  

}