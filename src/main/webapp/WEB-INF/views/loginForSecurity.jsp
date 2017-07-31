<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css" />">
</head>
<body>
	<div class="box-login" >
		<form name="form_login" action="j_spring_security_check" method="POST" >
			<div class="form-group ">
				<h3>Авторизация</h3>
				<input type="text" class="form-control" name="user-auth" placeholder="Ваше логин">
				<input type="password" class="form-control" name="password-auth" placeholder="Пароль">
				<h3 style="font-size:12px">
				<c:if test="${not empty error }">
					${error }
				</c:if>
				</h3>
				<input type="submit" class="btn btn-success" value="Вход">
			</div>
		</form>
	</div>
</body>
	
</html>