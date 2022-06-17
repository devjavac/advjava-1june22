

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class Result extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String data = request.getParameter("query");
		
		Cookie ck = new Cookie("lastsearch", data.replace(" ", "-")); // To create a Cookie
		ck.setMaxAge(60*60*48); // Set the expiry time of the cookie
		response.addCookie(ck); // add Cookie into a response
	
		
		out.print("<h1>You are searching for : "+data+" </h1>");
		
	}

}







