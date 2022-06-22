<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ToDoApp : Search Task</title>
</head>
<body>
<%@ include file="menu.jsp" %>

<div align="center"> 
	<h3>Search Your Task</h3>
	<form action="">
		Search By Status :<select name="status">
								<option value="open">Open</option>
								<option value="inprogress">In-progress</option>
								<option value="completed">Completed</option>
						</select>
		<br><br>
		
		Search By Scheduled Date : <input type="date" name="sdt">
		<br><br>
		<button  type="submit" class="btn btn-info">Search Task</button>
	</form>

</div>
</body>
</html>