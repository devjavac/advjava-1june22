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
	if(session.getAttribute("uname") == null) {
		response.sendRedirect("sign-in.jsp?code=-2");
	}

%>


<div align="right">
	<h3>Hello User, <%= session.getAttribute("uname") %></h3>
	<h3><a href="logout">Sign out</a></h3>
</div>

</body>
</html>