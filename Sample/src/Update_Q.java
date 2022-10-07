import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Update_Q {

	private static Object con;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Connection con=ConnectionProvider.getConnection();
			String q="update table user set id=?,name?,city=?";
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("enter the id");
			String id =br.readLine();
			
			System.out.println("enter the name");
			String name=br.readLine();
			
			System.out.println("enter the city");
			String city =br.readLine();
			
			PreparedStatement  pstmt= con.prepareStatement(q);
			
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, city);
			
			pstmt.executeUpdate();		
			
			System.out.println("updated");
			con.close();
			
			
			}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
