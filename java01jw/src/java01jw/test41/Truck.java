package java01jw.test41;

public class Truck extends Car{
   float weight = 1000; // kg
   boolean autoDump;
   public Truck(){
     super("미정", "미정", 800);
     autoDump = true;
     //super();
   }
}
