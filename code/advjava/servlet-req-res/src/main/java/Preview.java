

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/preview-details")
public class Preview extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String fn = request.getParameter("fname");
		String ln = request.getParameter("lname");
		String email = request.getParameter("email");
		
		String name = fn + " " + ln;
		
		out.print("<h1>Name : "+name+"</h1>");
		out.print("<h1>Email : "+email+"</h1>");
		
	}

}
