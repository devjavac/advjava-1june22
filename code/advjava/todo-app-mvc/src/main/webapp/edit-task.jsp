<%@page import="bean.TaskBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ToDoApp : Update Task</title>
</head>
<body>

<%@ include file="menu.jsp" %>

<div align="center"> 
	<h3>Update Task</h3>
	
	<%
		TaskBean bean = (TaskBean)request.getAttribute("taskInfo");
		String code = request.getParameter("code");
		String msg = "";
		String color ="";
		if(code!=null) {
			switch(code) {
				case "1":
					msg ="Task Updated Successfully";
					color="green";
					break;
				case "0":
					msg ="Task updation Failed..";
					color="red";
					break;
			}
		}
	%>
	<h3 style="color: <%=color%>"><%=msg%></h3>
	<form action="edit-task">
		<input type="hidden" name="id" value="<%= bean.getId() %>">
		Task Id <input type="text" name="id" value="<%= bean.getId() %>" disabled="disabled">
		<br><br>
		Task Title <input type="text" name="title" value="<%= bean.getTitle() %>">
		<br><br>
		Task Status <select name="status">
								<option value="open">Open</option>
								<option value="inprogress">In-progress</option>
								<option value="completed">Completed</option>
						</select>
		<br><br>
		Scheduled On <input type="date" name="sdt" value="<%= bean.getScheduledOn() %>">
		<br><br>
		<button type="submit" class="btn btn-info">Update Task</button>
	</form>
</div>

</body>
</html>





