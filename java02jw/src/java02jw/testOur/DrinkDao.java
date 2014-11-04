package java02jw.testOur;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DrinkDao{
  String filename;
  ArrayList<Drink> list = new ArrayList<Drink>();
  public void DrinkDao(){
    filename = "Drink.dat";
  }
  public void load() throws Exception{
    Scanner scanner = null;
    try{
      scanner = new Scanner(new FileReader(filename));
      while(true){
        try{
          list.add(new Drink(scanner.nextLine()));
        }catch (NoSuchElementException e){
          break;
        }
      }
    }catch (Exception e){
      list.clear();
    }finally{
      try{
        scanner.close();
      }catch(Exception e){

      }
    }

  }

  public void save() throws Exception{
    BufferedWriter out = null;
    try {

      out = new BufferedWriter(new FileWriter(filename));
      for( Drink drink : list) {
        out.write(drink.getName() + ","
            + drink.getMl() +"," 
            + drink.getAmount() + "\n");



      }
    } catch (Exception e) {
      throw e;

    }

    finally {
      try {out.close();} catch (Exception ex) {}
    }


  }

  public List<Drink> getList(){
    return list;

  }

  public boolean isValid(int index){
    if(index < 0 || index >= list.size()) return false;

    return true;    
  }

  public Drink getData(int index){
    if(isValid(index)) return list.get(index);

    return null;
  }


  public void delete(int index){
         list.remove(index);
  }

  public void add(Drink drink){
      list.add(drink);
  }

  public void change(int index, Drink drink){
      list.set(index, drink);
  }
}
