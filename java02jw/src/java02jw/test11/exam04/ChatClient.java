package java02jw.test11.exam04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatClient extends Frame{
  TextField serverAddr = new TextField(20);
  TextField name = new TextField(10);
  Button connectBtn = new Button("연결");
  TextArea content = new TextArea();
  TextField input = new TextField(30);
  Button sendBtn = new Button("보내기");

  public ChatClient(){
    //윈도우 준비
    Panel toolbar = new Panel(new FlowLayout(FlowLayout.LEFT));
    toolbar.add(new Label("이름: "));
    toolbar.add(name);
    toolbar.add(new Label("서버: "));
    //serverAddr.setColumns(columns);
    toolbar.add(serverAddr);

    toolbar.add(connectBtn);




    this.add(toolbar, BorderLayout.NORTH);
    this.add(content, BorderLayout.CENTER);



    Panel bottom = new Panel();
    bottom.add(input);
    bottom.add(sendBtn);
    this.add(bottom, BorderLayout.SOUTH);

    // 리스너 등록
    //this.addWindowListener(new MyWindowsListener());
    this.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    //connectBtn.addActionListener(new MyConnectLister());
    connectBtn.addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("연결 누름");
        
      }
    });
    sendBtn.addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("보내기 누름");
      }
    });
  }

  public static void main(String[] args) {
    ChatClient wnd = new ChatClient();
    wnd.setSize(400, 600);
    wnd.setVisible(true);
  }

/*  class MyWindowsListener extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e) {
      System.exit(0);
    }
  }*/
  
  /*class MyConnectLister implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println("연결 누름");
    }
    
  }
  class MySendListner implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println("보내기 누름");
    }
    
  }
*/
}
