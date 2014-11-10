/* UPDATE 실행
 * 
 * executeUpdate(SQL) 호출한다.
 * 
 */
package java02jw.test14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc08 {

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

			stmt.executeUpdate("UPDATE PRODUCTS SET" +
					" PNAME='넥서스55', QTY=896" +
					" WHERE PNO=10"
					);
			System.out.println("데이터 변경 완료");


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
