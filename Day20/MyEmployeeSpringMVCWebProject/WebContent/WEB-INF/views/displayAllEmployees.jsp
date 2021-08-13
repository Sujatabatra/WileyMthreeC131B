<%@page import="com.sujata.bean.Employee"%>
<%@page import="java.util.Collection"%>
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
</body>
</html>