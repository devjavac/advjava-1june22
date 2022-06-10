

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/singup")
public class Register extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String gender = request.getParameter("gender");
		String pass = request.getParameter("pass");
		
		out.print("<h1>Register Page...</h1>");
		out.print("<h1>Name : "+name+"</h1>");
		out.print("<h1>Email : "+email+"</h1>");
		out.print("<h1>COntact : "+contact+"</h1>");
		out.print("<h1>Gender : "+gender+"</h1>");
	}

}
