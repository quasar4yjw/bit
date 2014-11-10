/* INSERT 실행
 * 
 * executeUpdate() 호출한다.
 * 
 * 리눅스에서는 한글 값이 깨질 수 있다.
 * 해결책 => 연결정보에 문자집합을 설정해야한다. 
 * JDBC URL에 설정한다.
 * 예) jdbc:mysql://host:port/schema?useUnicode=true&characterEncoding=utf8
 */
package java02jw.test14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc07 {

	public static void main(String[] args) throws Exception{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
      
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC드라이버 로딩됨");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studydb" +
							"?useUnicode=true&characterEncoding=utf8",
					"study",
					"study");
			
			System.out.println("DBMS에 연결됨");
			
			stmt = con.createStatement();
			System.out.println("Statement 객체 준비 완료.");
			
			stmt.executeUpdate("INSERT INTO PRODUCTS(PNAME,QTY,MKNO)" +
					"VALUES('넥서스5', 60, 6)");
			
			
			
		}	catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {rs.close();} catch (Exception ex) {}
			System.out.println("ResultSet 객체 자원 해제");
		
			try {stmt.close();} catch (Exception ex) {}
			System.out.println("Statement객체 자원 해제");
			
			try {con.close();} catch (Exception ex) {}
			System.out.println("DBMS와 연결끊음");
		}

	}

}
