<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href='<c:url value="/styles/mystyle.css"></c:url>'>
</head>
<body>
<h1>Employee Details</h1>
<form action="./save" method="post">
	Enter Employee ID : <input type="text" name="empID"><br><br>
	Enter Employee Name : <input type="text" name="empName"><br><br>
	Select Employee Designation : <input type="radio" name="empDesig" value="Associate">Associate
	<input type="radio" name="empDesig" value="Sr. Associate">Sr. Associate
	<input type="radio" name="empDesig" value="Manager">Manager
	<input type="radio" name="empDesig" value="Architect">Architect<br><br>
	Select Employee Department : <select name="empDeptt">
		<option value="Sales">Sales</option>
		<option value="IT">IT</option>
		<option value="Marketing">Marketing</option>
		<option value="Purchase">Purchase</option>
		<option value="Production">Production</option>
	</select><br><br>
	Enter Employee Salary : <input type="text" name="empSalary"><br><br>
	<input type="submit" value="Save">
</form>

<br><br>

<a href="./">Go to Main Page</a>
</body>
</html>