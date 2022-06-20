<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<div align="center" >
	<h1>User Registration</h1>
	<%
		List<String> errorList = (List<String>) request.getAttribute("errors");
		if(errorList != null) {
			for(String msg : errorList) {
			%>
				<span style="color:red;"><%= msg%></span><br>
			<%	
			}
		}
	%>
	<form action="save-user">
		Enter name <input type="text" name="name" value="${param.name}">
		<br/><br/>
		Enter Contact <input type="text" name="contact" value="${param.contact}">
		<br/><br/>
		Enter Gender <input type="text" name="gender" value="${param.gender}">
		<br/><br/>
		Enter DOB <input type="date" name="dob" value="${param.dob}">
		<br/><br/>
		Enter Age <input type="text" name="age" value="${param.age}">
		<br/><br/>
		<button type="submit">Register</button>
	</form>
</div>

</body>
</html>