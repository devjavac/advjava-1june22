

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-auth")
public class Validate extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String userPassword = request.getParameter("pass");
		//DB Connection
		//select * from employee where email=? and password=?
		//if(rs.next()) -> return true valid user else invalid user
		if("admin".equals(userName) && "admin123".equals(userPassword))
		{
			
			// go to Home Page
			RequestDispatcher dis = request.getRequestDispatcher("user-home");
			dis.forward(request, response);
		} else {
			// go to Invalid Page
			response.sendRedirect("invalid-user");
		}
		
	}










}
