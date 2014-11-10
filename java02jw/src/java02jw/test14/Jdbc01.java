/*
 *  JDBC 드라이버 로딩
 */
package java02jw.test14;

import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class Jdbc01 {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		//DriverManager.registerDriver(new Driver());
		//하드코딩
		
		
		
	}

}
