package java01jw.test53.step06;

public class ReverseIterator extends Iterator{
  //int cursor;
  public ReverseIterator() {}
  
  @Override
  public void setList(String[] list) {
    /* super 키워드 : 오버라이딩 전의 메서드 지목 */
    super.setList(list);
    cursor = list.length - 1;
  } 
  
  public boolean hasNext() {
    if (cursor >= 0) return true;
    return false;
  }

  public String next() {
    return list[cursor--];
  }
}
