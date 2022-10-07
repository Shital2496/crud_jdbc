import java.sql.*;

public class Connection 
{

	public static final Connection Provider = null;

	public static void main(String[] args) 
	{
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver");
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/crud_database";
		String username= "root";
		String password="root";
		
		java.sql.Connection con= DriverManager.getConnection(url,username,password);
		
		String q="create table user(id string (20),name varchar(30) not null,city varchar(30))";
		
		Statement stmt= con.createStatement();
		stmt.executeUpdate(q);
		
		System.out.println("table created");
		
		con.close();
		
		
	
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}


		
		
		
			
			
        
			
		    
			
		
		
		
	
	
		

	
