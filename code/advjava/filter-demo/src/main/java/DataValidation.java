
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// Regular Expression (Regex) using Pattern and Matcher

@WebFilter("/save-user")
public class DataValidation implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		final String DOUBLEREGEX = "[0-9\\.]" ; // For Double Value
		final String INTREGEX = "[0-9]" ; // For Numeric Value
		
		Pattern double_ptrn = Pattern.compile(DOUBLEREGEX);
		Pattern int_ptrn = Pattern.compile(INTREGEX);
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String contact = req.getParameter("contact");
		String dob = req.getParameter("dob");
		String age = req.getParameter("age");
		
		ArrayList<String> errorMsgs = new ArrayList<String>();
		if(name == null || name.isEmpty()) {
			errorMsgs.add("Please enter Name");
		}
		if(contact == null || contact.isEmpty()) {
			errorMsgs.add("Please enter Contact");
		}
		if(gender == null || gender.isEmpty()) {
			errorMsgs.add("Please enter Gender");
		}
		if(dob == null || dob.isEmpty()) {
			errorMsgs.add("Please enter Date of Birth");
		}
		
		if(age == null || age.isEmpty()) {
			errorMsgs.add("Please enter Age");
		} else {
			Matcher match = int_ptrn.matcher(age);
			if(match.find()) {
				double ageInt = Double.parseDouble(age);
				if(!(ageInt>=18 && ageInt<=60)) {
					errorMsgs.add("Invalid Age.. Age must be between 18-60");
				}
			}
			else {
				errorMsgs.add("Invalid Age.. Age must numeric..");
			}
		}
		
		if(errorMsgs.isEmpty()) {
			chain.doFilter(request, response); // to forward request to the original page
		} else {			req.setAttribute("errors", errorMsgs);
			RequestDispatcher dis = req.getRequestDispatcher("Register.jsp");
			dis.forward(req, res);
		}
		System.out.println("This is the Post processing code");
	}

}
