package JDBCtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavSql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    String user = "root";
	    String pass = "venkat";
	    String url = "jdbc:mysql://localhost:3306/jdbctest";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    
	    
	    Connection con = DriverManager.getConnection(url,user,pass);
	    Statement st=con.createStatement();
	    st.executeUpdate("insert into emp8(id,name_,age)values(2,'vikram',23)");
//	    ResultSet rs = st.executeQuery("select*from emp8");
//	    while(rs.next()) {
//	    	String name =rs.getString("name_");
//	    	int age=rs.getInt("age");
//	    	System.out.println(name+":"+age);
//	    }
	    System.out.println("done");
	    
	    

	}

}
