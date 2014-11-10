/*
 *  JDBC 드라이버 로딩
 */
package java02jw.test14;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc02 {

	public static void main(String[] args) throws Exception{
		Connection con = null;
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
		}	catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {con.close();} catch (Exception ex) {}
			System.out.println("DBMS와 연결끊음");
		}

	}

}
