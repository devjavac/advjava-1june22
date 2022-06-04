import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first-servlet")
public class FirstServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Service method from the First Servlet...");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>Welcome To First Servlet Response</h1>");
		
		out.print("<div align='center'>");
			out.print("<form action=''>");
				out.print("<img alt='' src='images/google.png' height='20%' width='10%'>");
				out.print("<input type='text' name='msg'><br><br>");
				out.print("<input type='submit' value='Search'>");
			out.print("</form>");
		out.print("</div>");
		
		
		
	}
}





