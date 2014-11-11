package java02jw.test16.command;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java02jw.test16.Members;
import java02jw.test16.MembersDao;
import java02jw.test16.annotation.Command;
import java02jw.test16.annotation.Component;

@Component
public class MembersCommand {
  MembersDao membersDao;
  Scanner scanner;
  
  public void setMembersDao(MembersDao membersDao) {
    this.membersDao = membersDao;
  }
  
  public void setScanner(Scanner scanner) {
    this.scanner = scanner;
  }
  
  @Command("add")
  public void add(Map<String, Object> params) {
    Members members = new Members();
    String text = null;
    
    System.out.print("아이디:");
    text = scanner.nextLine();
    if (text.length() > 0)
    members.setId(text);
    
    System.out.print("비밀번호:");
    text = scanner.nextLine();
    if (text.length() > 0)
    members.setPwd(text);
    
    System.out.print("이메일:");
    text = scanner.nextLine();
    if (text.length() > 0)
    members.setEmail(text);
    
    System.out.print("주문자명:");
    text = scanner.nextLine();
    if (text.length() > 0)
    members.setName(text);
    
    System.out.print("전화:");
    text = scanner.nextLine();
    if (text.length() > 0)
    members.setTel(text);
    
    System.out.print("팩스:");
    text = scanner.nextLine();
    if (text.length() > 0)
    members.setFax(text);
    
    System.out.print("상세주소:");
    text = scanner.nextLine();
    if (text.length() > 0)
    members.setAddr(text);
    
    System.out.print("주문자사진:");
    text = scanner.nextLine();
    if (text.length() > 0)
    members.setPhot(text);
    
    System.out.print("주소번호:");
    try{
    members.setAno(Integer.parseInt(scanner.nextLine()));
    }catch(Exception ex){
    }
    
    membersDao.insert(members);
    System.out.println("저장하였습니다.");
  }
  
  @Command("delete")
  public void delete(Map<String, Object> params) {
    @SuppressWarnings("unchecked")
    ArrayList<String> options = 
        (ArrayList<String>)params.get("options");
    
    String no = options.get(0);
    
    Members members = membersDao.selectOne(no);
    if (members == null) {
      System.out.println("해당 번호의 제품 정보를 찾을 수 없습니다.");
      return;
    }
    
    System.out.print(members.getName() + "을 삭제하시겠습니까?(y/n)");
    if (scanner.nextLine().equalsIgnoreCase("y")) {
      membersDao.delete(no);
      System.out.println("삭제하였습니다.");
    } else {
      System.out.println("삭제 취소하였습니다.");
    }
  }
  
  @Command("list")
  public void list(Map<String, Object> params) {
    for (Members members : membersDao.selectList()) {
      System.out.printf("%-3s %-20s %-20s %-15s\n", 
          members.getId(), 
          members.getName(), 
          members.getEmail(), 
          members.getTel());
    }
  }
  
  @Command("update")
  public void update(Map<String, Object> params) {
    @SuppressWarnings("unchecked")
    ArrayList<String> options = 
        (ArrayList<String>)params.get("options");
    
    String no = options.get(0);
    
    Members members = membersDao.selectOne(no);
    if (members == null) {
      System.out.println("해당 번호의 제품 정보를 찾을 수 없습니다.");
      return;
    }
    
    Members tempMembers = null;
    
    try {
      tempMembers = members.clone();
    } catch (CloneNotSupportedException ex) {
      throw new RuntimeException(ex);
    }
    
    String text = null;
    System.out.printf("비밀번호(%s):", members.getPwd());
    text = scanner.nextLine();
    if (text.length() > 0)
      tempMembers.setPwd(text);
    System.out.printf("이메일(%s):", members.getEmail());
    text = scanner.nextLine();
    if (text.length() > 0)
      tempMembers.setEmail(text);
    System.out.printf("주문자명(%s):", members.getName());
    text = scanner.nextLine();
    if (text.length() > 0)
      tempMembers.setName(text);
    System.out.printf("전화(%s):", members.getTel());
    text = scanner.nextLine();
    if (text.length() > 0)
      tempMembers.setTel(text);
    System.out.printf("팩스(%s):", members.getFax());
    text = scanner.nextLine();
    if (text.length() > 0)
      tempMembers.setFax(text);
    System.out.printf("상세주소(%s):", members.getAddr());
    text = scanner.nextLine();
    if (text.length() > 0)
      tempMembers.setAddr(text);
    System.out.printf("주문자사진(%s):", members.getPhot());
    text = scanner.nextLine();
    if (text.length() > 0)
      tempMembers.setPhot(text);
    
    System.out.print("정말 변경하시겠습니까?(y/n)");
    if (scanner.nextLine().equalsIgnoreCase("y")) {
      membersDao.update(tempMembers);
      System.out.println("변경하였습니다.");
    } else {
      System.out.println("변경 취소하였습니다.");
    }
  }
  
  @Command("view")
  public void view(Map<String, Object> params) throws Exception {
    @SuppressWarnings("unchecked")
    ArrayList<String> options = 
        (ArrayList<String>)params.get("options");
    
    String no = options.get(0);
    
    Members members = membersDao.selectOne(no);
    if (members == null) {
      System.out.println("해당 번호의 제품 정보를 찾을 수 없습니다.");
      return;
    }
    
    System.out.println("아이디: " + no);
    System.out.println("비밀번호: " + members.getPwd());
    System.out.println("이메일: " + members.getEmail());
    System.out.println("주문자명: " + members.getName());
    System.out.println("전화: " + members.getTel());
    System.out.println("팩스: " + members.getFax());
    System.out.println("상세주소: " + members.getAddr());
    System.out.println("주문자사진: " + members.getPhot());
    System.out.println("주소번호: " + members.getAddr());
  }
}








