

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/auth-user")
public class ValidateUser extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNm = request.getParameter("user");
		String userPass = request.getParameter("pass");
		
		if("admin".equals(userNm) && "admin123".equals(userPass)) {
			HttpSession session = request.getSession(); 
			session.setAttribute("uname", userNm);
			response.sendRedirect("home.jsp");
		} else {
			response.sendRedirect("sign-in.jsp?code=-1");
		}
	}
}
