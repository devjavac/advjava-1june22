package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectQueryAggFun {
	public static void main(String[] args) {
		try {
			
			Connection con = DBConnectionUtil.getConnection();
			
			PreparedStatement stmt = con.prepareStatement("select count(id) as count from product");
			ResultSet set = stmt.executeQuery();
			set.next();
			System.out.println(set.getInt("count"));
			
			DBConnectionUtil.closeConnection(con);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
