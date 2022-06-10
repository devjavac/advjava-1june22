<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
  </div>
</nav>

 <div class="row">

	<div class="col-sm-1">
	</div>

	<div class="col-sm-5">
		<h1>User Login</h1>
		<form action="singin" method="post">
 			Enter User Name : <input type="text" name="name">
 			<br><br>
 			Enter Password :  <input type="password" name="pass">
 			<br><br>
 			<button class="btn btn-primary" type="submit">Login</button>
 		</form>
	</div>


	<div class="col-sm-5">
		<h1>User Register</h1>
		<form action="singup">
 			Enter User Name : <input type="text" name="name">
 			<br><br>
 			Enter User Email : <input type="text" name="email">
 			<br><br>
 			Enter User Contact : <input type="text" name="contact">
 			<br><br>
 			Enter User Gender : <input type="radio" name="gender" value="Male">Male
 								<input type="radio" name="gender" value="Female">Female
 			<br><br>
 			Enter Password :  <input type="password" name="pass">
 			<br><br>
 			<button class="btn btn-success" type="submit">Register</button>
 		</form>
	</div>		

 	<div class="col-sm-1">
	</div>
 	
 
 </div>

</body>
</html>