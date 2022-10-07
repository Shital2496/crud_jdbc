import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class Select_Q {

	public static void main(String[] args, Object con) {
		// TODO Auto-generated method stub
		try {
			
			
			Connection conn =ConnectionProvider.getConnection();
		
			String q="select * from user";
			
			Statement stmt =conn.createStatement();		
			ResultSet set=stmt.executeQuery(q);
			
			while(set.next())
			{
				String id=set.getString(1);
				String name= set.getString(2);
				String city= set.getString(3);
			}
			System.out.println("display");
			conn.close();
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		

	}

}
