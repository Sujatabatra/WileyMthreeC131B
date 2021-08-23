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
<h2>Welcome ${user.username }!</h2>
<h1>Employee Management System</h1>
<a href="./displayAllEmps">List all Employees</a><br><br>
<a href="./insertEmpPage">Insert Employee</a><br><br>
<a href="./searchEmpPage">Search Employee By ID</a><br><br>
<a href="./deleteEmpPage">Delete Employee</a><br><br>
<a href="./updateEmpPage">Update Employee Salary</a><br><br>
<a href="./generatePaySlipPage">Generate Employee Payslip</a><br><br>
</body>
</html>