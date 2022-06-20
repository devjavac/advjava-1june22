<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ToDoApp : Create Task</title>
</head>
<body>

<%@ include file="menu.jsp" %>

<div align="center"> 
	<h3>Create New Task</h3>
	
	<%
		String code = request.getParameter("code");
		String msg = "";
		String color ="";
		if(code!=null) {
			switch(code) {
				case "1":
					msg ="Task Created Successfully";
					color="green";
					break;
				case "0":
					msg ="Task Creation Failed..";
					color="red";
					break;
			}
		}
	%>
	<h3 style="color: <%=color%>"><%=msg%></h3>
	<form action="new-task">
		Enter Task Title <input type="text" name="title">
		<br><br>
		Enter Task Status <select name="status">
								<option value="open">Open</option>
								<option value="inprogress">In-progress</option>
								<option value="completed">Completed</option>
						</select>
		<br><br>
		Scheduled On <input type="date" name="sdt">
		<br><br>
		<button type="submit" class="btn btn-success">Create Task</button>
	</form>
</div>

</body>
</html>