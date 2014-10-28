/* File을 사용하여 디렉토리 안의 파일 목록을 출력한다. 
 * 
 */
package java02jw.test02;

import java.io.File;

public class Test06 {

  public static void main(String[] args) throws Exception{
    displayList(".");

  }
  public static void displayList(String filename){
    System.out.println("@@@" + filename);
    System.out.println("====");


    File f = new File(filename);
    if(f.isDirectory()){
      String[] files = f.list();
      for (String name : files){
        //System.out.println(name);
        
        displayList(f.getPath() + "/" + name);
      }
    }
  }
}


/*
.
====
src
icon1-01.jpg
icon1.jpg
.classpath
bbb
.gitignore
.project
bin

*/