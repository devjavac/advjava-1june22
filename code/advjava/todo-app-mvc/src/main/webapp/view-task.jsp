<%@page import="bean.TaskBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ToDo : View Task</title>
</head>
<body>
<%@ include file="menu.jsp" %>

<div align="center">
	<h1>Your All task</h1>
	
	<div class="row">
	<div class="col-sm-2">
	</div>
  <div class="col-sm-8">
	<table class="table table-bordered table-hover">
		<thead>
			<tr>
				<th>Title</th>
				<th>Status</th>
				<th>Scheduled On</th>
				<th>Updated On</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
		<%
			List<TaskBean> tasks = (List<TaskBean>) request.getAttribute("tasks");
			if(tasks != null || !tasks.isEmpty()) {
				for(TaskBean obj : tasks) {
		%>
			<tr>
				<td><%= obj.getTitle() %></td>
				<td><%= obj.getStatus() %></td>
				<td><%= obj.getScheduledOn()  %></td>
				<td><%= obj.getUpdatedOn() %></td>
				<td> <a class="btn btn-success" href="update-task?id=<%=obj.getId()%>">Edit</a> </td>
				<td> <a class="btn btn-danger" href="#">Delete</a></td>
			</tr>
		<%		
				}
			}
		%>
		</tbody>
	
	</table>
	
	</div>
	</div>
	



</div>
</body>
</html>