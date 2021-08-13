<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Update</h1>
<form action="./updateEmp" method="post">
Enter Employee ID : <input type="text" name="empId"><br><br>
Enter Employee New Salary : <input type="text" name="empSalary"><br><br>
<input type="submit" value="Update Salary">
</form>
<br><br>
<a href="./">GO To Main Page</a>
</body>
</html>