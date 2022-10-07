import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() throws SQLException{
		// TODO Auto-generated method stub
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver");
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/crud_database";
		String username= "root";
		String password="root";
		
		java.sql.Connection con= DriverManager.getConnection(url,username,password);
		
		System.out.println("connected");
		con.close();
		
		
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		return null;

}
}
