
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href='<c:url value="/styles/mystyle.css"></c:url>'>
</head>
<body>
<h2>Welcome ${user.username }!</h2>
<h1>Employee Details</h1>
<c:if test="${not empty employee }">
<%-- 
<% Employee employee=(Employee)request.getAttribute("employee");
	if(employee!=null){ %>
--%>
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
</c:if>
<%-- 
<%} else %>
--%>
<c:if test="${empty employee}">
		<h1>Employee does not exist</h1>
</c:if>
<br><br>
<a href="./main">GO To Main Page</a>
</body>
</html>