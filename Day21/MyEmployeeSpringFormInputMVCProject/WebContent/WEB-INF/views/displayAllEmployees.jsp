<%@page import="com.sujata.bean.Employee"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href='<c:url value="/styles/mystyle.css"></c:url>'>
</head>
<body>
<h1>Employee Details</h1>
<%-- 
<% out.println("Displaying message with scriptlets"); %>
<%="displaying message with expression tag" %>
--%>
<table border="1">
	<tr>
		<td>Employee ID</td>
		<td>Employee Name</td>
		<td>Designation</td>
		<td>Department</td>
		<td>Salary</td>
	</tr>
	<% Collection<Employee> employees=(Collection<Employee>)request.getAttribute("employees");
	for(Employee employee:employees){
	%>
	<tr>
		<td><%=employee.getEmpId() %></td>
		<td><% out.println(employee.getEmpName()); %></td>
		<td><%=employee.getDesignation() %></td>
		<td><%=employee.getDepartment() %></td>
		<td><%=employee.getEmpSalary() %></td>
	</tr>
	<% } %>
</table>
<br><br>
<a href="./">Go To Main Page</a>
<hr>
<table border="1">
	<tr>
		<td>Employee ID</td>
		<td>Employee Name</td>
		<td>Designation</td>
		<td>Department</td>
		<td>Salary</td>
	</tr>
	<c:forEach items="${employees}" var="emp">
	<tr>
		<td>${emp.empId }</td>
		<td>${emp.empName }</td>
		<td>${emp.designation}</td>
		<td>${emp.department }</td>
		<td>${emp.empSalary }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>