<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cks = request.getCookies(); // get all the cookies from the request
	String previosSearch = "No Result Found";
	if(cks!=null) {
		for(Cookie ck : cks) {
			if("lastsearch".equals(ck.getName())) {
				previosSearch = ck.getValue().replaceAll("-", " ");
			}
		}
	}
%>
<div align="center">

	<h1>Your Last Search : <br> <%= previosSearch %></h1>

	<form action="result">
		Enter Query <input type="text" name="query"><br><br>
		<button type="submit">Search</button>
	</form>
</div>	
</body>
</html>