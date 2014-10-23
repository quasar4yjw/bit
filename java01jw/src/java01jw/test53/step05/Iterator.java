package java01jw.test53.step05;

abstract public class Iterator {
  String[] list;
  int cursor;
  public void setList(String[] list) {
    this.list = list;
  } //공통성이 있는 초기화 함수이지만 리버스는 예외적이라 +@ 오버라이드 해야함

  abstract public boolean hasNext();//매번 자식들한테 새로 만들어줘야하니까

  abstract public String next();
}
