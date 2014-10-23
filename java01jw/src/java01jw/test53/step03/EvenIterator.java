package java01jw.test53.step03;

public class EvenIterator {
   String[] list;
   int cursor;
   
   public EvenIterator(String[] list) {
     this.list = list;  
   }
   
   public boolean hasNext() {
     if (cursor < list.length) return true;
     return false;
   }
   
   public String next() {
     String value = list[cursor];
     cursor += 2;
     return value;
   }
}
