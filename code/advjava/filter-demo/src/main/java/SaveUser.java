

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save-user")
public class SaveUser extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		System.out.println("This is the save Servlet");
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String contact = request.getParameter("contact");
		String dob = request.getParameter("dob");
		String age = request.getParameter("age");
		
		out.print("<h1>Name : "+name+"</h1>");
		out.print("<h1>Contact : "+contact+"</h1>");
		out.print("<h1>Gender : "+gender+"</h1>");
		out.print("<h1>Dob : "+dob+"</h1>");
		out.print("<h1>Age : "+age+"</h1>");
		
	}

}
