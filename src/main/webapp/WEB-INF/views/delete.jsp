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
	<div class="box-login del"  >
		<form action="">
			<div class="form-group ">
			
				<h3>Вы действительно хотите удалить ученика ${name} ?</h3>
				<a type="button" href="<c:url value="/delete/${id}" />" class="btn btn-danger">Удалить</a>
				<a type="button" href="<c:url value="/table" />" class="btn btn-success">Назад</a>
			</div>
		</form>
	</div>
</body>
	
</html>