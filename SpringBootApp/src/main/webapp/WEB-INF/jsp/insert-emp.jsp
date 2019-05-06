<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
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
	<form:form method="post" commandName="emp">
		<form:hidden path="employeeId" />
		<fieldset class="form-group">
			<form:label path="employeeId">Employee Id</form:label>
			<form:input path="employeeId" type="text" class="form-control"
				required />
			<form:errors path="employeeId" cssClass="text-warning"></form:errors>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="employeeName">Employee Name</form:label>
			<form:input path="employeeName" type="text" class="form-control"
				required />
			<form:errors path="employeeName" cssClass="text-warning"></form:errors>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="employeeAddress">Employee Address</form:label>
			<form:input path="employeeAddress" type="text" class="form-control"
				required />
			<form:errors path="employeeAddress" cssClass="text-warning"></form:errors>
		</fieldset>

		<button typee="submit" class="btn btn-success">Add Success</button>
	</form:form>

</body>
</html>