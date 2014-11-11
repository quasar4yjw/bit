package java02jw.test16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
public class MembersDao {
  public MembersDao() {}

  public Members selectOne(String no) {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb", 
          "study", 
          "study");
      stmt = con.createStatement();
      rs = stmt.executeQuery(
          "SELECT UID,PWD,EMAIL,UNAME,TEL,FAX,DET_ADDR,PHOT,ANO FROM MEMBERS"
          + " WHERE UID='" + no + "'");
      if (rs.next()) {
        Members members = new Members();
        members.setId(rs.getString("UID"));
        members.setPwd(rs.getString("PWD"));
        members.setEmail(rs.getString("EMAIL"));
        members.setName(rs.getString("UNAME"));
        members.setTel(rs.getString("TEL"));
        members.setFax(rs.getString("FAX"));
        members.setAddr(rs.getString("DET_ADDR"));
        members.setPhot(rs.getString("PHOT"));
        members.setAno(rs.getInt("ANO"));
        return members;
      } else {
        return null;
      }
      
    } catch (Exception ex) {
      throw new RuntimeException(ex);
      
    } finally {
      try {rs.close();} catch (Exception ex) {}
      try {stmt.close();} catch (Exception ex) {}
      try {con.close();} catch (Exception ex) {}
    }
  }
  
  public void update(Members members) {
    Connection con = null;
    Statement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb" + 
            "?useUnicode=true&characterEncoding=utf8", 
          "study",
          "study");
      stmt = con.createStatement();
      stmt.executeUpdate("UPDATE MEMBERS SET"
        + " PWD='" + members.getPwd()
        + "', EMAIL='" + members.getEmail()
        + "', UNAME='" + members.getName()
        + "', TEL='" + members.getTel()
        + "', FAX='" + members.getFax()
        + "', DET_ADDR='" + members.getAddr()
        + "', PHOT='" + members.getPhot() + "'"
        + " WHERE UID=" + members.getId());
      
    } catch (Exception ex) {
      throw new RuntimeException(ex);
      
    } finally {
      try {stmt.close();} catch (Exception ex) {}
      try {con.close();} catch (Exception ex) {}
    }
  }
  
  public void delete(String no) {
    Connection con = null;
    Statement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb" + 
            "?useUnicode=true&characterEncoding=utf8", 
          "study",
          "study");
      stmt = con.createStatement();
      stmt.executeUpdate("DELETE FROM MEMBERS"
          + " WHERE UID='" + no +"'");
      
    } catch (Exception ex) {
      throw new RuntimeException(ex);
      
    } finally {
      try {stmt.close();} catch (Exception ex) {}
      try {con.close();} catch (Exception ex) {}
    }
  }
  
  public List<Members> selectList() {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb", 
          "study", 
          "study");
      stmt = con.createStatement();
      rs = stmt.executeQuery(
          "SELECT UID,PWD,EMAIL,UNAME,TEL,FAX,DET_ADDR,PHOT,ANO FROM MEMBERS");
      
      ArrayList<Members> list = new ArrayList<Members>();
      Members members = null;
      
      while (rs.next()) {
        members = new Members();
        members.setId(rs.getString("UID"));
        members.setPwd(rs.getString("PWD"));
        members.setEmail(rs.getString("EMAIL"));
        members.setName(rs.getString("UNAME"));
        members.setTel(rs.getString("TEL"));
        members.setFax(rs.getString("FAX"));
        members.setAddr(rs.getString("DET_ADDR"));
        members.setPhot(rs.getString("PHOT"));
        members.setAno(rs.getInt("ANO"));
        list.add(members);
      }
      
      return list;
      
    } catch (Exception ex) {
      throw new RuntimeException(ex);
      
    } finally {
      try {rs.close();} catch (Exception ex) {}
      try {stmt.close();} catch (Exception ex) {}
      try {con.close();} catch (Exception ex) {}
    }
  }
  
  public void insert(Members members) {
    Connection con = null;
    Statement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/studydb" + 
            "?useUnicode=true&characterEncoding=utf8", 
          "study",
          "study");
      stmt = con.createStatement();
      if (members.getAno() == 0) {
      	stmt.executeUpdate("INSERT INTO MEMBERS(UID,PWD,EMAIL,UNAME,TEL,FAX,DET_ADDR,PHOT,ANO)" +
            " VALUES('" + members.getId()
            + "','" + members.getPwd() 
            + "','" + members.getEmail() 
            + "','" + members.getName()
            + "','" + members.getTel()
            + "','" + members.getFax()
            + "','" + members.getAddr()
            + "','" + members.getPhot()
            + "'," + "NULL" + ")");
      } else {
      stmt.executeUpdate("INSERT INTO MEMBERS(UID,PWD,EMAIL,UNAME,TEL,FAX,DET_ADDR,PHOT,ANO)" +
        " VALUES('" + members.getId()
        + "','" + members.getPwd() 
        + "','" + members.getEmail() 
        + "','" + members.getName()
        + "','" + members.getTel()
        + "','" + members.getFax()
        + "','" + members.getAddr()
        + "','" + members.getPhot()
        + "'," + members.getAno() + ")");
      }
    } catch (Exception ex) {
      throw new RuntimeException(ex);
      
    } finally {
      try {stmt.close();} catch (Exception ex) {}
      try {con.close();} catch (Exception ex) {}
    }
  }
}


















