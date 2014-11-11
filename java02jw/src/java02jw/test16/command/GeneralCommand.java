package java02jw.test16.command;

import java.util.Map;
import java02jw.test16.MembersDao;
import java02jw.test16.annotation.Command;
import java02jw.test16.annotation.Component;

@Component
public class GeneralCommand {
  MembersDao membersDao;
  
  public void setMembersDao(MembersDao membersDao) {
    this.membersDao = membersDao;
  }

  @Command("exit")
  public void doExit(Map<String, Object> params) throws Exception {
    System.out.println("안녕히 가세요.");
  }
  
  @Command("help")
  public void doHelp(Map<String, Object> params) throws Exception {
    System.out.println("list");
    System.out.println("view 아이디");
    System.out.println("add");
    System.out.println("delete 아이디");
    System.out.println("update 아이디");
    System.out.println("exit");
  }
  
  
}









