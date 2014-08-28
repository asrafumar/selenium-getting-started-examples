import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");       
		     
		     Connection conn = DriverManager.getConnection("jdbc:sqlserver://edsrvqadb1\\edqa1_dw;user=EDAPPUSER;password=EDApp@321;database=ED_DW");
		     
	   	     //System.out.println("test");
		     Statement sta = conn.createStatement();
		
		     String Sql = "select * from ED.Deal";
		     
		     ResultSet rs = sta.executeQuery(Sql);
		     
		     while (rs.next()) {
		     
		    	 System.out.println(rs.getString("SPV_Name") + rs.getString("Id"));
		

	}

}
	public static void openDB()  throws ClassNotFoundException, SQLException{ 
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");       
    
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://edsrvqadb1\\edqa1_dw;user=EDAPPUSER;password=EDApp@321;database=ED_DW");
    
	    Statement sta = conn.createStatement();

	    String Sql = "select * from ED.Deal";
    
	    ResultSet rs = sta.executeQuery(Sql);
    
	    while (rs.next()) {
    
	    	System.out.println(rs.getString("SPV_Name") + rs.getString("Id"));
    }

}
}
