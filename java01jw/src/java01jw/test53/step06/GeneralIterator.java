package java01jw.test53.step06;

public class GeneralIterator extends Iterator{
  //int cursor;

  public GeneralIterator(){}

  public boolean hasNext() {
    if (cursor < list.length) return true;
    return false;
  }

  public String next() {
    return list[cursor++];
  }
}
