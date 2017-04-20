<%@ page import="com.juntown.dummy.UserDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
	<link rel="stylesheet" href="resources/css/bootstrap.css">
</head>
<body align="center">
<div class="alert alert-success" role="alert">
<form action="register.lms" method="post">
<ul class="list-group">
	<li class="list-group-item">
		id : <input type="text" name="id" value="${user.id}">
	</li>
	<li class="list-group-item">
		pw : <input type="password" name="password">
	</li>
	<li class="list-group-item">
		confirm pw : <input type="password" name="confirmPassword">
	</li>
</ul>
	<input type="submit" value="전송">
</form>
<span class="label label-danger">${msg }</span><Br/>
</div>
</body>
</html>