<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Payslip for Employee ID : ${payslip.employee.empId }</h1>
<table border="1">
	<tr>
		<td>Name</td>
		<td>Designation</td>
		<td>Department</td>
		<td>Salary</td>
		<td>HRA</td>
		<td>DA</td>
		<td>PF</td>
		<td>Total Salary</td>
	</tr>
	<tr>
		<td>${payslip.employee.empName }</td>
		<td>${payslip.employee.designation }</td>
		<td>${payslip.employee.department }</td>
		<td>${payslip.employee.empSalary }</td>
		<td>${payslip.hr }</td>
		<td>${payslip.da }</td>
		<td>${payslip.pf }</td>
		<td>${payslip.totalSalary }</td>
	</tr>
</table>

<br><br>
<a href="./">Go To Main Page</a>
</body>
</html>