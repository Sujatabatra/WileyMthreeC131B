<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href='<c:url value="/styles/mystyle.css"></c:url>'>
<title>Insert title here</title>
</head>
<body>
<h1>Employee Management System</h1>
<spring:form action="./login">
Enter UserName : <spring:input path="username"/><br><br>
Enter password : <spring:password path="password"/><br><br>
<input type="submit" value="Login">
</spring:form>
</body>
</html>