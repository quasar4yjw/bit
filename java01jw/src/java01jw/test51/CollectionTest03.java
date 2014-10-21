package java01jw.test51;

class MyArray2 {
  Object[] list = new Object[3];
  int cursor;

  public int add(Object instance){
    if (cursor < list.length){
      list[cursor++] = instance;
      return 0;
    }else {
      return -1;}
  }

  public int size() {
    return cursor;
  }
  public Object get(int index){
    return list[index];
  }

  public int remove(int index){
    if (index >= 0 && index < this.cursor){
      //list[index] = null;
      for (int i = index; i < this.cursor; i++){
        if (i == (this.cursor - 1)){
          list[i] = null;
          this.cursor--;
        } else{
          list[i] = list[i + 1];
        }


      }
      return 0;

    } else {
      return -1;
    }
  }

  public int insert(int pos) {
    return -1;
  }
}
public class CollectionTest03 {

  public static void main(String[] args) {
    MyArray2 arr = new MyArray2();
    System.out.println(arr.add("홍길동00"));
    System.out.println(arr.add("홍길동11"));
    System.out.println(arr.add("홍길동22"));
    System.out.println(arr.add("홍길동33"));
    System.out.println(arr.add("홍길동44"));
    System.out.println(arr.add("홍길동55"));
    System.out.println(arr.add("홍길동66"));
    System.out.println(arr.add("홍길동77"));
    System.out.println(arr.add("홍길동88"));
    System.out.println(arr.add("홍길동99"));
    System.out.println(arr.add("홍길동1010"));
    System.out.println(arr.add("홍길동1111"));


    int size = arr.size();

    for (int i = 0; i < size; i++){
      System.out.println(arr.get(i));
    }
  }
}

