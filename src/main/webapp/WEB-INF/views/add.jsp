<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<div class="box-login add" >
		<form:form action="add" method="POST" commandName="student" >
			<div class="form-group ">
				<h3>Добавить ученика</h3>
				<label>Имя 
				<form:input type="text" class="form-control" path="firstname" placeholder="Имя"/></label>
				<label>Фамилия 
				<form:input type="text" class="form-control" path="lastname" placeholder="Фамилия"/></label>
				<label>Класс
				<form:input type="text" class="form-control" path="level" placeholder="Класс"/></label>
				<label>Оценка
				<form:input type="number" min="2" max="5" path="valuation" value="4" class="form-control"/></label>
				<br><br>
				<input type="submit" value="Добавить" class="btn btn-success">
				<a type="button" href="<c:url value="/table" />" class="btn btn-default">Назад</a>
			</div>
		</form:form>
	</div>
</body>
	
</html>