package java01jw;

public class Pineapple extends AppleMelon{  
  public void getFruit(int fruitId){  
    System.out.println("파인애플 1개 줄게");
  }  
   public static void main(String[] args){
    AppleMelon amelon2 = new AppleMelon();
    //amelon2.getFruit(2);
    amelon2.getFruit(2, "2");
    amelon2.getFruit("2");
    
    Pineapple amelon3 = new Pineapple();
    amelon3.getFruit(3);
    amelon3.getFruit(3, "3");
    amelon3.getFruit("3");
    
  }
 // public static void main(String[] args){}
}  
 
