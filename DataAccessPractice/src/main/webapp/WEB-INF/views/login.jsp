<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="myfdmversion.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="bannernav">
		<div class="flexContainer">
			<div id="logo">
				<a href=""><img src="fdm-logo.png" alt="FDM logo"></a>
			</div>
			<div class="cat1">
				<a href="login"><p>Login</p></a>
			</div>
			<div class="cat1">
				<a href="register"><p>Register</p></a>
			</div>
			<div class="cat1">
				<a href="userProfile"><p>Profile</p></a>
			</div>
		</div>
	</div>
	<div class="center">
		<p>Register!</p>
		<form action="register" method="POST">
			<div class="flexContainer center">
				<p>Username:&nbsp;</p>
				<p></p>
				<input type="text" name="username" placeholder="Username" />
			</div>

			<div class="flexContainer center">
				<p>Password:&nbsp;</p>
				<input type="password" name="password" placeholder="Password" />
			</div>
			<input type="submit" value="Sign-in!" />
		</form>
	</div>
</body>
</html>