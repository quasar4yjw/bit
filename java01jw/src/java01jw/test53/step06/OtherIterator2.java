package java01jw.test53.step06;


import java.util.ArrayList;
import java01jw.test53.step05.Iterator;

public class OtherIterator2 extends Iterator {
  ArrayList<String> randomList = new ArrayList<String>();
  int cursor;
  
  
  

  public OtherIterator2() {}

  @Override
  public void setList(String[] list) {
    // TODO Auto-generated method stub
    super.setList(list);
    for (String value : list){
    randomList.add(value);
    }
  }
  public boolean hasNext() {
    if (cursor < list.length)
      return true;
    else 
      return false;
  }

  public String next() {
    String value = list[cursor];
    cursor += 2;
    return value;
  }
}










