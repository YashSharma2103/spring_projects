<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<style>
	.error
	{
		color:red;
	}
</style>
</head>
<body>
	<div class="home-container">
		<div>
			<h1>Welcome to the NCU Store</h1>
			<p>Place where you can buy different things for yourself or others</p>
		</div>
		<div>
			<p>Please login to continue ahead or if you are a new user kinldy Sign Up pressing the below  button</p>
			<a href="register">Sign Up</a>
			<br>
			<br>
			<h2>Login</h2>
			<br>
			<form:form action="seller" method="post" modelAttribute="login">
				<label for="user">User Name:</label><br>
				<form:input type="text" path="user"/>
				<br>
				<label for="password">Password:</label><br>
				<form:input type="password" path="password"/>
				<br>
				<br>
				<input type="submit" value="Login">
			</form:form>
		</div>
	</div>
</body>
</html>
