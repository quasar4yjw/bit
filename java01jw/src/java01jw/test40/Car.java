package java01jw.test40;

public class Car {
  String maker;
  String model;
  int cc = 800; 
  boolean diesel;
  java.util.Date releaseDate;
  int capacity = 5;
  public Car() {
    this.maker ="미정";
    this.model ="미정";
  }
   
   
  public Car(String maker, String model, int cc){
    this.maker = maker;
    this.model = model;
    this.cc = cc;
    
  }
}