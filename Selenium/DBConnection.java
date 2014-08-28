import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "test";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
		 
		try{
		Class.forName(driver).newInstance();// create object of Driver
		conn = DriverManager.getConnection(url+dbName,userName,password);
		// connection will be established
		 
		// *******************Statement******************
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from users");
		while(rs.next()){
		System.out.println(rs.getString(1) + "--"+rs.getString(2)+" -- "+rs.getString(3));
		}
		 
		}catch(Exception e){
		e.printStackTrace();
		}finally{
		conn.close();
		}

	}

}
