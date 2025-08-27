<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register</h1>
	<sf:form action="register" method="post" modelAttribute="user">
		<sf:input type="text" placeholder="Username" path="username" />
		<p></p>
		<sf:input type="text" placeholder="First name" path="firstname" />
		<p></p>
		<sf:input type="text" placeholder="Last name" path="lastname" />
		<p></p>
		<sf:input type="text" placeholder="Password" path="password" />
		<p></p>
		<input type="text" placeholder="PasswordConfirm"
			path="passwordConfirm" />
		<p></p>
		<input type="sumbit" value="Register!" />

	</sf:form>
</body>
</html>