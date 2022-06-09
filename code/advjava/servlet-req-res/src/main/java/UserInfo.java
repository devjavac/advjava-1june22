

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-details")
public class UserInfo extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<form action='preview-details'>");
			out.print("Enter First Name : <input type='text' name='fname'><br><br>");
			out.print("Enter Last Name : <input type='text' name='lname'><br><br>");
			out.print("Enter Email ID : <input type='text' name='email'><br><br>");
			out.print("<input type='submit' value='preview'><br><br>");
		out.print("</form>");
	}

}
