/* DAO(Data Access Object)
 - 데이터의 퍼시스턴스(Persistence) 담당
   => 데이터의 보관(등록,조회,변경,삭제) 
 * 
 */
package java02jw.test15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class ProductDao {
	public ProductDao() {}

	public Product selectOne(int no) {
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
					"SELECT PNO,PNAME,QTY,MKNO FROM PRODUCTS"
							+ " WHERE PNO=" + no);
			if (rs.next()) {
				Product product = new Product();
				product.setNo(rs.getInt("PNO"));
				product.setName(rs.getString("PNAME"));
				product.setQuantity(rs.getInt("QTY"));
				product.setMakerNo(rs.getInt("MKNO"));
				return product;
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

	public void update(Product product) {

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

			stmt.executeUpdate("UPDATE PRODUCTS SET"
					+ " PNAME='" + product.getName()
					+ "', QTY=" + product.getQuantity()
					+ " WHERE PNO=" +product.getNo());

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		} finally {
			try {stmt.close();} catch (Exception ex) {}
			try {con.close();} catch (Exception ex) {}
		}
	}


	public void delete(int no) {
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
      
      stmt.executeUpdate("DELETE FROM PRODUCTS "
          + "WHERE PNO=" + no);
      
    } catch (Exception ex) {
    	throw new RuntimeException(ex);
    } finally {
      try {stmt.close();} catch (Exception ex) {}
      try {con.close();} catch (Exception ex) {}
    }
		
	}

	public List<Product> selectList() {
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
					"SELECT PNO,PNAME,QTY,MKNO FROM PRODUCTS");
			ArrayList<Product> list = new ArrayList<>();
			Product product = null;
			while (rs.next()) {
				product = new Product();
				product.setNo(rs.getInt("PNO"));
				product.setName(rs.getString("PNAME"));
				product.setQuantity(rs.getInt("QTY"));
				product.setMakerNo(rs.getInt("MKNO"));
				list.add(product);
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

	public void insert(Product product) {
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

			stmt.executeUpdate("INSERT INTO PRODUCTS(PNAME,QTY,MKNO)" +
					" VALUES('" + product.getName()
					+ "'," + product.getQuantity()
					+ "," + product.getMakerNo() + ")");

		} catch (Exception ex) {
			throw new RuntimeException(ex);

		} finally {
			try {stmt.close();} catch (Exception ex) {}
			try {con.close();} catch (Exception ex) {}
		}

	}

	/*public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		Product p = new Product();
		
		dao.delete(15);
		
	  

		//Product product = dao.selectOne(1);
		List<Product> list = dao.selectList();

		for(Product pe :list){
			System.out.println(pe);
		}

	}*/
}










