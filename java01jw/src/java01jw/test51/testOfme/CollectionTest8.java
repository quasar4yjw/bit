package java01jw.test51.testOfme;

import java01jw.test51.testOfme.MyLinkedList2.Bucket;

class MyStack {
  Object[] list = new Object[100];
  int top;
  
  public void push(Object value) {
    if(top < list.length){
      list[top++] = value;
    }
  }
  
  // 마지막에 입력한 값을 꺼낸다. 목록에서 제거됨.
  public Object pop() {
    if(top != 0){
    Object imm = list[top-1];
    list[top---1] = null;  
    return imm;
    }
    return null;
    
  }
}

class MyQueue {
  class Bucket {
    Object value;
    Bucket next;
  }
  
  Bucket start;
  Bucket end;
  
  public MyQueue() {
    start = new Bucket();
    end = start;
  }
  
  public void add(Object value) {
/*    Bucket imm = new Bucket();
    end.value = value;
    if(start == end) start.next = imm;
    else end.next = imm;
    end = imm;*/
    end.value = value;
    end.next = new Bucket();
    end = end.next;
  }
  
  // 첫 번째 입력 값을 꺼낸다. 목록에서 제거됨.
  public Object poll() {
    if (start != end){
    Object imm = start.value;
    start = start.next;
    return imm;
    }
    return null;
/*  Object imm = start.value;
    end = start.next;
    
    return imm;*/
    
  }
}



public class CollectionTest8 {

  public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push("0000");
    stack.push("1111");
    stack.push("2222");
    stack.push("3333");
    
    for (int i = 0; i < 4; i++) {
      System.out.println(stack.pop());
    }//for
    /* 예상 출력 결과
     3333
     2222
     1111
     0000
     */
    System.out.println("-----@@@@-------");
    System.out.println(stack.list[0]);
    System.out.println(stack.list[1]);
    System.out.println(stack.list[2]);
    System.out.println(stack.list[3]);
    System.out.println("------@@@---------");
    
    MyQueue queue = new MyQueue();
    queue.add("AAAA");
    queue.add("BBBB");
    queue.add("CCCC");
    queue.add("DDDD");
    
    for (int i = 0; i < 4; i++) {
      System.out.println(queue.poll());
    }
    
    //for
    /* 예상 출력 결과
    AAAA
    BBBB
    CCCC
    DDDD
    */
  }

}













