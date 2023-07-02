<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/style.css">
<title>New User</title>
</head>
<body>
	<div class="register-container">
		<a href="redirect">Go Back</a>
		<h2>Welcome to the Registration Page</h2>
		<p>Fill in the following details</p>
		<br>
		<form:form action="redirect" method="post" modelAttribute="user">
			<label>First Name:</label>
			<br>
			<form:input type="text" path="fname" />
			<form:errors path="fname" cssClass="error" />
			<br>
			<br>
			<label>Last Name:</label>
			<br>
			<form:input type="text" path="lname" />
			<form:errors path="lname" cssClass="error" />
			<br>
			<br>
			<label>User Name:</label>
			<br>
			<form:input type="text" path="user" />
			<form:errors path="user" cssClass="error" />
			<br>
			<br>
			<label>Password:</label>
			<br>
			<form:input type="text" path="password" />
			<form:errors path="password" cssClass="error" />
			<br>
			<br>
			<label>E-Mail:</label>
			<br>
			<form:input type="text" path="email" />
			<form:errors path="email" cssClass="error" />
			<br>
			<br>
			<label>User Type:</label>
			<form:select path="type">
				<form:options items="${ user.typeOptions }" />
			</form:select>
			<br>
			<br>

			<input type="submit" value="Register" />
		</form:form>
	</div>
</body>
</html>