package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnectionUtil {

	private final static String driver = PropertyLoader.getValue("driver");
	private final static String url = PropertyLoader.getValue("url");
	private final static String userName = PropertyLoader.getValue("user");
	private final static String pass = PropertyLoader.getValue("password");
	
	// create at DB connection and return the Connection Object 
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userName, pass);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	// method is use to close the connection provided by user
	public static void closeConnection(Connection con) {
		try {
			if(con!=null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
