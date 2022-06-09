

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/life-cycle")
public class ServletLifeCycle extends HttpServlet {
	
	Connection con;
	
	public void init(ServletConfig config) throws ServletException {
		// DB Connection can be created
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava1june","root","root");
			System.out.println("Connection Created Successfully...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("This is a init method.. Called after Object creation");
	}

	public void destroy() {
		// DB Connection can be Close
		try {
			con.close();
			System.out.println("Connection close Successfully...");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("This is a destory method.. Called at Object destroy time");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// DB Connection can be created
		try {
			//PreparedStatement stmt = con.prepareStatement("Query");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("This is a service method.. Called after every Request");
	}

}







