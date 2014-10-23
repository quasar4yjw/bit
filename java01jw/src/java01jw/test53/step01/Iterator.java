package java01jw.test53.step01;

public class Iterator {
   String[] list;
   int cursor;
   
   public Iterator(String[] list) {
     this.list = list;  
   }
   
   public boolean hasNext() {
     if (cursor < list.length) return true;
     return false;
   }
   
   public String next() {
     return list[cursor++];
   }
}