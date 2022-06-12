<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preview Details</title>
</head>
<body>
<%
	String degree = request.getParameter("degree");
	String year = request.getParameter("year");
	String percent = request.getParameter("percent");
	
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");

	String city = request.getParameter("city");
	String pin = request.getParameter("pin");
	String state = request.getParameter("state");
%>
	<div align="center">
		<h1>Preview Details</h1>
		<hr>
		<h3>Personal Details</h3>
			<h4>Name : <%= name %> </h4>
			<h4>Email : <%= email %> </h4>
			<h4>Contact : <%= contact %> </h4>
		<hr>
		<h3>Address Details</h3>
			<h4>City : <%= city %> </h4>
			<h4>Pincode : <%= pin %> </h4>
			<h4>State : <%= state %> </h4>
		<hr>
		<h3>Educational Details</h3>
			<h4>Degree : <%= degree %> </h4>
			<h4>Passing Year : <%= year %></h4>
			<h4>Percentage : <%= percent %>%</h4>
		<hr>
		
		
		<h2><a href="save-emp-details?name=<%=name%>&contact=<%=contact%>">Continue and Save</a></h2>
		
	</div>


</body>
</html>






