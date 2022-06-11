<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>

<div align="center">

	<h2>Product Details</h2>
	
	<%
		String msg = request.getParameter("msg");
		String result = ""; 
		if("success".equals(msg)) {
			result = "Product Save Successfully";
		} else if ("error".equals(msg)) {
			result = "Product creation Failed... Try After Some time";
		}
	%>
	
	<h4><%= result %></h4>
	
	<form action="save-product.jsp">
		Enter Id : <input type="text" name="id"><br><br>
		Enter Name : <input type="text" name="name"><br><br>
		Enter Price : <input type="text" name="price"><br><br>
		Enter Quantity : <input type="text" name="qty"><br><br>
		<button type="submit">Save</button>
	
	</form>

</div>




</body>
</html>