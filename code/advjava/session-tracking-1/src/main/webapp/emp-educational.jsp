<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Educational Details</title>
</head>
<body>
<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String contact = request.getParameter("contact");

String city = request.getParameter("city");
String pin = request.getParameter("pin");
String state = request.getParameter("state");
%>

	<div align="center">
		<h1>Step 3 of 3</h1>
		<hr>
		<h3>Employee Educational Details</h3>
		<form action="preview.jsp">
			<input type="hidden" name="name" value="<%=name%>">
			<input type="hidden" name="email" value="<%=email%>">
			<input type="hidden" name="contact" value="<%=contact%>">
			
			<input type="hidden" name="city" value="<%=city%>">
			<input type="hidden" name="pin" value="<%=pin%>">
			<input type="hidden" name="state" value="<%=state%>">
		
		
			Enter Higher Degree : <input type="text" name="degree">
			<br/><br/>
			Enter Passing Year : <input type="text" name="year">
			<br/><br/>
			Enter Percentage : <input type="text" name="percent">
			<br/><br/>
			<button type="submit">Preview</button>
		</form>
	</div>


</body>
</html>