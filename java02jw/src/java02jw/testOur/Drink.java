package java02jw.testOur;

public class Drink {
 private String name;
 private int ml;
 private int amount;
  
  public Drink() {}
 
  public Drink(String name, int ml, int amount){
    this.name = name;
    this.ml = ml;
    this.amount = amount;
  }
  
  public Drink(String splitString){
    String name = splitString;
    
    
  }
  
  public String getName() {
    return name;
    
  }
  public int getMl() {
    return ml;
    
  }
  public int getAmount() {
    return amount;
    
  }
  
  
}
