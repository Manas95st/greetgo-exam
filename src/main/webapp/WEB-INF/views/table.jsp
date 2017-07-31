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
	<div class="container">
		<div class="col-md-3"><h2>Список учеников</h2></div>
		<div class="col-md-3"><br><a href="<c:url value="/add" />" type="button" class="btn btn-success">Добавить ученика</a></div>
		<div class="col-md-3"></div>
		<div class="col-md-3"><br><a href="j_spring_security_logout" type="button" class="btn btn-info">Выйти</a></div>
  		<div class="col-md-12">
			  <table class="table table-striped">
			    <thead>
			      <tr>
			      	<th>Номер</th>
			        <th>Имя</th>
			        <th>Фамилия</th>
			        <th>Класс</th>
			        <th>Оценка</th>
			        <th>Удалить</th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach items="${list}" var="student">
				      <tr>
				        <td>${student.id}</td>
				        <td>${student.firstname}</td>
				        <td>${student.lastname}</td>
				        <td>${student.level}</td>
				        <td>${student.valuation}</td>
				        <td>
				        	<a class="btn btn-danger" href="<c:url value="/deletequestion/${student.id}/${student.firstname}" />">Удалить</a>
				        </td>
				      </tr>
			      	</c:forEach>
			    </tbody>
			  </table>
		</div>
	</div>
</body>
</html>