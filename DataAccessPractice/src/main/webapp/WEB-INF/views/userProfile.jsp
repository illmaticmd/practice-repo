<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="myfdmversion.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Profile</title>
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
	<h1>Welcome, ${ user.firstName }</h1>
	<p>Here is your Name: ${ user.firstName } ${ user.lastName }</p>
	<p>Here is your Username: ${ user.username }</p>
	<p>Here is your Password: "blank"</p>
	<p>Here is your E-mail: ${ user.email }</p>
</body>
</html>