<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Address Details</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");
%>
	<div align="center">
		<h1>Step 2 of 3</h1>
		<hr>
		<h3>Employee Address Details</h3>
		<form action="emp-educational.jsp">
			<input type="hidden" name="name" value="<%=name%>">
			<input type="hidden" name="email" value="<%=email%>">
			<input type="hidden" name="contact" value="<%=contact%>">
			Enter City : <input type="text" name="city">
			<br/><br/>
			Enter Pincode : <input type="text" name="pin">
			<br/><br/>
			Enter State : <input type="text" name="state">
			<br/><br/>
			<button type="submit">Next</button>
		</form>
	</div>
</body>
</html>