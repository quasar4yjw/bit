package java01jw.test53.step06;

public class EvenIterator extends Iterator{
 // int cursor = 5;
  public EvenIterator() {
    // TODO Auto-generated constructor stub
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
