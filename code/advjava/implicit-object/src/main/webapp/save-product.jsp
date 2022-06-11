
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Product</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String price = request.getParameter("price");
	String qty = request.getParameter("qty");
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava1june","root","root");
		PreparedStatement stmt = con.prepareStatement("insert into product values(?,?,?,?)");
		stmt.setInt(1, Integer.parseInt(id));
		stmt.setString(2, name);
		stmt.setDouble(3, Double.parseDouble(price));
		stmt.setInt(4, Integer.parseInt(qty));
		int count = stmt.executeUpdate();
		con.close();
		if(count>0) {
			response.sendRedirect("product-info.jsp?msg=success");
		} else {
			response.sendRedirect("product-info.jsp?msg=error");
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	
%>




</body>
</html>