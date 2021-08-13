<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Details</h1>
<table border="1">
	<tr>
		<td>Employee ID</td>
		<td>Employee Name</td>
		<td>Designation</td>
		<td>Department</td>
		<td>Salary</td>
	</tr>
	<tr>
		<td>${employee.empId }</td>
		<td>${employee.empName }</td>
		<td>${employee.designation }</td>
		<td>${employee.department }</td>
		<td>${employee.empSalary }</td>
	</tr>
</table>
<br><br>
<a href="./">GO To Main Page</a>
</body>
</html>