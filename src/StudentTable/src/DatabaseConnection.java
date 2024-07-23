
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class can be used to initialize the database connection
public class DatabaseConnection {
	protected static Connection initializeDatabase()
		throws SQLException, ClassNotFoundException
	{
		// Initialize all the information regarding
		// Database Connection
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String URL = "jdbc:mysql:// localhost:3306/jdbctest";
		
		
		String name = "root";
		String pass= "root";

		Class.forName(dbDriver);
		Connection con = DriverManager.getConnection(URL,name,pass);
		return con;
	}
}

