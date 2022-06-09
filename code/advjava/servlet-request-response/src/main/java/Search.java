import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/search")
public class Search extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head>");
			out.print("<title>User Search</title>");
		out.print("</head>");
		out.print("<body>");
			out.print("<form action='result'>");
				out.print("Search For : <input type='text' name='query'>");
				out.print("<br/>");
				out.print("<br/>");
				out.print("<button type='submit'>Search</button>");
			out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}
}







