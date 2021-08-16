<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href='<c:url value="/styles/mystyle.css"></c:url>'>
</head>
<body>
<h1>Employee Update</h1>

<spring:form action="./updateEmp" method="post">
	Select Employee ID : <spring:select path="empId">
		<spring:options items="${empIds}"/>
	</spring:select><br><br>
	Enter Employee New Salary :<spring:input path="empSalary"/><br><br>
	<input type="submit" value="Update Salary">
</spring:form>

<!--  
<form action="./updateEmp" method="post">
Enter Employee ID : <input type="text" name="empId"><br><br>
Enter Employee New Salary : <input type="text" name="empSalary"><br><br>
<input type="submit" value="Update Salary">
</form>
-->
<br><br>
<a href="./">GO To Main Page</a>
</body>
</html>