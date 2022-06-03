package jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class SelectQuery {
	public static void main(String[] args) {
		try {
			Connection con = DBConnectionUtil.getConnection();
			PreparedStatement stmt = 
					con.prepareStatement("select id,name,price*qty as totalPrice from product");
			ResultSet rs = stmt.executeQuery(); 
			
			while(rs.next()) {
				System.out.print(rs.getInt("id") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.println(rs.getDouble("totalPrice") + "\n");
			}
			DBConnectionUtil.closeConnection(con);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
