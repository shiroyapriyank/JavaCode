<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<caption>Your Employee Lists are</caption>
			<thead>
				<tr>
					<th>Employee Id</th>
					<th>Employee Name</th>
					<th>Employee Address</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${emp}" var="emp">
					<tr>
						<td><c:out value="${emp.employeeId}" /></td>
						<td><c:out value="${emp.employeeName}" /></td>
						<td><c:out value="${emp.employeeAddress}" /></td>
						<td><a type="button" class="btn btn-success"
							href="/edit-emp?empId=<c:out value="${emp.employeeId}" />">Update</a></td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-emp?empId=<c:out value="${emp.employeeId}" />">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button" href="/insert-emp">Add an Employee</a>
		</div>
	</div>
</body>
</html>