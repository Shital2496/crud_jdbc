import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Insert_Q 
{

	public static void main(String[] args)
	{
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/crud_database?useSSL=false";
			String username= "root";
			String password="root";
			
			
			java.sql.Connection con= DriverManager.getConnection(url,username,password);
		
		String q="insert into user(id,name,city)values(?,?,?)";
		
		PreparedStatement pstmt= con.prepareStatement(q);
		
		pstmt.setString(1, "1");
		pstmt.setString(2, "xyz");
		pstmt.setString(3, "PUNE");
		
		pstmt.executeUpdate();
		System.out.println("inserted");
		con.close();
		
		
		}catch (Exception e)
		{
			e.printStackTrace();
		System.out.println("inserted");
	
		
				
		}
		
	}
}



