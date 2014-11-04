package java02jw.testOur.command;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import java02jw.testOur.Drink;
import java02jw.testOur.DrinkDao;
import java02jw.testOur.annotation.Command;
import java02jw.testOur.annotation.Component;
  

@Component
public class GeneralCommand {
  Scanner scanner = null;
  DrinkDao drinkDao = null;
   public void setDrinkDao(DrinkDao drinkDao){
     this.drinkDao = drinkDao;
   }
  
   public void setScanner(Scanner scanner){
     this.scanner = scanner;
   }
  
  @Command("add")
    public void doAdd(Map<String, Object> params){
      ArrayList<String> list;
      list = (ArrayList<String>)params.get("option");
      
      Drink drink = new Drink(list.get(0), 
          Integer.parseInt(list.get(1)), 
          Integer.parseInt(list.get(2)));
      
      drinkDao.add(drink);
      
      
    }
  
  
  @Command("update")  
    public void doUpdate(){
      
    }
  
  
  
  @Command("list")
    public void doList(){
      
    }
  
  
  
  @Command("Exit")
    public void doExit(){
      
    }
}
