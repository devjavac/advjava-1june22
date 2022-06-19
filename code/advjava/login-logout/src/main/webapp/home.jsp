<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<%
	String name = (String) session.getAttribute("uname"); 
	int age = (Integer) session.getAttribute("age");

	if(session.getAttribute("uname") == null) {
		response.sendRedirect("sign-in.jsp?code=-2");
	}

%>

<div align="right">
	<h3>Hello User, <%= session.getAttribute("uname") %></h3>
	<h3><a href="logout">Sign out</a></h3>
</div>
<hr>
<div align="center">
	<h1>Welcome To Home Page</h1>
</div>


</body>
</html>