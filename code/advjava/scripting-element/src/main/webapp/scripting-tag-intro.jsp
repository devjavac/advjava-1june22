<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello
	
	
<%
	int i = 20;
	System.out.println(20*20);
	
	if(i>10) {
%>		
		<%= 20*20 %>
<%
	}
%>

<%!
	static int j = 30;
	int k = 40;
	public void test() {
		System.out.println("Custom Method");
	}
%>

<%! 
	static int counter = 0; 
%>

<%
	counter++;
%>


<h1>Number Of visits : <%= counter %> </h1>


<%
	for(int x = 1 ; x<=10 ; x++) {
%>
		5 * <%= x %> = <%= 5*x %>
		<br/>
<%	
	}
%>







<!-- <h1>Hello</h1> -->


<%-- 
<%
	System.out.println("Test");
%> 
--%>





</body>
</html>

























