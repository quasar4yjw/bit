package java01jw.test51;


/* 버킷 관리 */
class MyLinkedList2 {
  class Bucket {
    //값을 저장하기 위한 변수 선언
    Object value;
    // 다음 버킷의 주소 저장 : 링크 정보
    Bucket next;
  }
  
  Bucket start;
  Bucket end;
  int size;

  public MyLinkedList2(){
    start = new Bucket();
    end = start;
  }


  public int add(Object value) {
    end.value = value;
    //Bucket empty = new Bucket();
    end.next = new Bucket();
    end = end.next;
    return ++size;
  }

  public int size() {
    return size;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.size) return null;

    Bucket cursor = start;
    for (int i = 1; i <= index; i++){
      cursor = cursor.next;
    } // for
    return cursor.value;
  } 
/*  public void insert(int index, value){
    
  }*/
}
  /*public class CollectionTest05 {
    public static void printArray(MyLinkedList list) {
      for (int i = 0; i < list.size(); i++) {
        list.get(i));
      }// for
    }


    public static void main(String[] args) {
      MyLinkedList2 arr = new MyLinkedList2();
      arr.add("00000");
      arr.add("11111");
      arr.add("22222");
      arr.add("33333");
      arr.add("44444");
      arr.add("55555");
      arr.add("66666");
      arr.add("77777");

      
      printArray(arr);
      
      
      printArray(arr);
      
      arr.insert(0, "!!!!!!");
      arr.insert(9, "999999");
    }
    
  }*/


















