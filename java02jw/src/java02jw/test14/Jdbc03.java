/* Statement 객체 얻기
 * => DBMS에 SQL문을 역할을 수행한다.
 * => java.sql.Connection 구현체를 통해서 얻을 수 있다.
 * 
 */
package java02jw.test14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc03 {

	public static void main(String[] args) throws Exception{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
      
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC드라이버 로딩됨");

			//1.구현체 로딩

			//2. DM에게 Connection 객체를 부탁

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studydb",
					"study",
					"study");
			
			System.out.println("DBMS에 연결됨");
			
			stmt = con.createStatement();
			System.out.println("Statement 객체 준비 완료.");
			
			/*executeQuery(SELECT문);
			executeUpdate(INSERT/DELETE/UPDATE문);
			execute(ALL)*/
			
			rs = stmt.executeQuery("SELECT * FROM PRODUCTS");
			System.out.println("서버에 질의 완료. ResultSet 준비완료");
			
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
