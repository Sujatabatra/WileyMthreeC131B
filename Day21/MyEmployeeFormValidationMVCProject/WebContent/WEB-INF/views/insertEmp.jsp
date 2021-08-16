<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color:red;
}
</style>
<link rel="stylesheet" href='<c:url value="/styles/mystyle.css"></c:url>'>
</head>
<body>
<h1>Employee Details</h1>

<spring:form action="./save" method="post" modelAttribute="emp">
	Enter Employee ID :<spring:input path="empId"/><br><br>
	Enter Employee Name : <spring:input path="empName"/>
	<spring:errors path="empName" cssClass="error"></spring:errors><br><br>
	Select Designation : <spring:radiobutton path="designation" value="Associate" label="Associate"/>
	<spring:radiobutton path="designation" value="Sr. Associate" label="Sr. Associate"/>
	<spring:radiobutton path="designation" value="Manager" label="Manager"/>
	<spring:radiobutton path="designation" value="Architect" label="Architect"/><br><br>
	Select Employee Department : <spring:select path="department">
	<spring:option value="Marketing">Marketing</spring:option>
	<spring:option value="Sales">Sales</spring:option>
	<spring:option value="IT">IT</spring:option>
	<spring:option value="Purchase">Purchase</spring:option>
	</spring:select><br><br>
	Enter Employee Salary : <spring:input path="empSalary"/><br><br>
	<input type="submit" value="Save">
</spring:form>

<!--  
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
-->
<br><br>

<a href="./">Go to Main Page</a>
</body>
</html>