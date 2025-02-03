<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="submitform" method="post">

		<label>UserName : </label> <input type="text" name="uname"
			value="${User.email}"> 
			<br> <br> 
		<label>PassWord: </label> <input type="password" name="pass" 
			value="${User.password}">
		<br> <br>
		<button type="submit">SUBMIT</button>
	</form>
	<br>
	<br>
	<a href="/"> back to HOME</a></body>
</html>