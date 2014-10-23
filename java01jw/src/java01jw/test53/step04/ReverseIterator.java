package java01jw.test53.step04;

public class ReverseIterator {
  String[] list;
  int cursor;
  public ReverseIterator() {
    // TODO Auto-generated constructor stub
  }
  public ReverseIterator(String[] list) {
    this.list = list;  
    cursor = list.length - 1; // 배열의 끝 인덱스 가리킴 ㅇㅋ
  }
  public void setList(String[] list) {
    this.list = list;
  } 
  public boolean hasNext() {
    if (cursor >= 0) return true;
    return false;
  }

  public String next() {
    return list[cursor--];
  }
}
