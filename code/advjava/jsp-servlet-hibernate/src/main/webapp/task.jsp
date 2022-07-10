<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">

	<% 
		String code = request.getParameter("c");
		String msg = "";
		if(code != null) {
			switch(code) {
			case "1" :
				msg = "Task Created Successfully";
				break;
			}
		}
	%>
	<h3><%= msg %></h3>

	<form action="create-new-task">
		Enter Title : <input type="text" name="title">
		<br><br>
		Select Status : <select name="status">
							<option value='O'>Open</option>
							<option value='I'>In-progress</option>
							<option value='C'>Completed</option>
						</select>
		<br><br>
		Scheduled Date : <input type="date" name="sd">
		<br><br> 
		<button type="submit">Create Task</button>
	</form>
</div>

</body>
</html>