package harsh.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
public static Connection getConnection() {
	String dbURL="jdbc:mysql://localhost:8080/harsh_schema?useSSL=false";
	String dbUsername="root";
	String dbPassword="noicetoitssmort";
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con =DriverManager.getConnection(dbURL , dbUsername , dbPassword);
		
	}
	catch (ClassNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	return con;
	
}
}
