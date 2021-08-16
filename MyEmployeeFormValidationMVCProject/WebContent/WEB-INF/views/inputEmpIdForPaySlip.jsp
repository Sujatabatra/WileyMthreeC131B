<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href='<c:url value="/styles/mystyle.css"></c:url>'>
</head>
<body>
<h2>Welcome ${user.username }!</h2>
<h1>Employee Payslip</h1>
<form action="./payslip" method="post">
	Enter Employee ID : <input type="text" name="empId"><br><br>
	<input type="submit" value="Generate Payslips">
</form>
<br><br>
<a href="./main">Go To Main Page</a>
</body>
</html>