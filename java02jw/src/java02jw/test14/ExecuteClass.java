package java02jw.test14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ExecuteClass {
	static String command;
	static Connection con = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception, Error{
		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studydb" + 
							"?useUnicode=true&characterEncoding=utf8", 
							"study",
					"study");

			stmt = con.createStatement();
			System.out.println("1111111111111111");
			rotate();
			System.out.println("22222222222222222");
		} catch(Exception ex){}
		
		finally{
			try {rs.close();} catch (Exception ex) {}

			try {stmt.close();} catch (Exception ex) {}

			try {con.close();} catch (Exception ex) {}
		}

		//rotate(list);

	}//main()


	public static void doList(){


		try {

			/*stmt.executeUpdate("INSERT INTO PRODUCTS(PNAME,QTY,MKNO)" +
          " VALUES('넥서스10', 99, 6)");*/

			rs = stmt.executeQuery("SELECT T1.PNO, T1.PNAME, T1.QTY, T2.MKNAME" + 
					" FROM PRODUCTS T1 LEFT OUTER JOIN MAKERS T2 ON T1.MKNO=T2.MKNO");
			System.out.printf("%-3s %-20s %7s %-10s\n" , 
					"번호", 
					"제품명",
					"수량",
					"제품명");
			while (rs.next()) {
				// 결과를 가져왔다면 데이터는 ResultSet 객체에 들어 있다.
				System.out.printf("%-5d %-20s %7d %-10s\n" , 
						rs.getInt("PNO"), 
						rs.getString("PNAME"),
						rs.getInt("QTY"),
						rs.getString("MKNAME"));
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			
		}
	}//list


	public static void doAdd(){
		try {


			System.out.print("제품명: ");
			String PNAME = scanner.nextLine();
			System.out.print("수량: ");
			String QTY = scanner.nextLine();
			System.out.print("제조사: ");
			String MKNO = scanner.nextLine();
			String total = "'" + PNAME + "'," + QTY + "," + MKNO;
			System.out.print("저장하시겠습니까?(y/n) ");
			if (scanner.nextLine().equalsIgnoreCase("y")){

				stmt.executeUpdate("INSERT INTO PRODUCTS(PNAME,QTY,MKNO)" +
						" VALUES("+ total + ")");

				System.out.println("저장하였습니다");
			} else {
				System.out.println("저장 취소하였습니다");
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {


			
		}
	}//add

	public static void doUpdate(int i){
		try {
			String PNAME = "", QTY = "", MKNO = "";

			rs = stmt.executeQuery("SELECT T1.PNAME, T1.QTY, T1.MKNO" + 
					" FROM PRODUCTS T1 WHERE T1.PNO="+i);
			while(rs.next()){
				PNAME = rs.getString("PNAME");
				QTY = rs.getInt("QTY") +"";
				MKNO = rs.getInt("MKNO") +"";
			}

			System.out.print("제품명(" + PNAME + ")? ");
			PNAME = scanner.nextLine();
			System.out.print("수량(" + QTY + ")? ");
			QTY = scanner.nextLine();
			System.out.print("제조사(" + MKNO + ")?" );
			MKNO = scanner.nextLine();
			System.out.print("변경하시겠습니까?(y/n) ");
			if (scanner.nextLine().equalsIgnoreCase("y")){


				stmt.executeUpdate("UPDATE PRODUCTS SET" +
						" PNAME='"+ PNAME +"', QTY=" + QTY +", MKNO=" + MKNO +
						" WHERE PNO=" + i);

				System.out.println("변경하였습니다");
			} else {
				System.out.println("변경 취소하였습니다");
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			
		}
	}//update

	public static void doDelete(int i){
		try {
			String PNAME = "";
			/*stmt.executeUpdate("INSERT INTO PRODUCTS(PNAME,QTY,MKNO)" +
          " VALUES('넥서스10', 99, 6)");*/
			rs = stmt.executeQuery("SELECT T1.PNAME" + 
					" FROM PRODUCTS T1 WHERE T1.PNO="+i);

			while(rs.next()){
				PNAME = rs.getString("PNAME");
			}

			//System.out.print(PNAME + "를 삭제하시겠습니까?(y/n) ");
			//PNAME = scanner.nextLine();
			System.out.print(PNAME + "를 삭제하시겠습니까?(y/n) ");
			if (scanner.nextLine().equalsIgnoreCase("y")){

				stmt.executeUpdate("DELETE FROM PRODUCTS"
						+ " WHERE PNO = "+ i);
				 
				
				System.out.println("삭제 하였습니다");
			} else {
				System.out.println("삭제 취소하였습니다");
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			
		}
	}//delete





	public static void rotate() throws Exception{
		System.out.print("명령> ");

		try{
			while (true) {
				command = scanner.nextLine();

				if(command
						.substring(0, 3)
						.equalsIgnoreCase("add")) {
					doAdd();

				}//if add


				else if(command
						.substring(0, 4)
						.equalsIgnoreCase("list")) {

					doList();


				}//if list



				else if(command
						.substring(0, 6)
						.equalsIgnoreCase("delete")) {


					int i = Integer.parseInt(command.split(" ")[1]);
					doDelete(i);

				}//if delete

				else if(command
						.substring(0, 6)
						.equalsIgnoreCase("update")) {

					int i = Integer.parseInt(command.split(" ")[1]);

					doUpdate(i);

				}//if update

				System.out.print("\n명령> ");
			}//while



		} catch (RuntimeException ex){
			rotate();
		} // 아무것도 입력안하거나 글자수 짧거나 
		//등등 에러 캐치하고 main메소드 다시 실행
	}//rotate()


}//class










