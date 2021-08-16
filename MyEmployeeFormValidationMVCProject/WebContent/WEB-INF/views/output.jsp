<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href='<c:url value="/styles/mystyle.css"></c:url>'>
<title>Insert title here</title>
</head>
<body>
<h2> Welcome ${user.username} !</h2>
<h1>Employee Management System</h1>

<h2>${message }</h2>

<a href="./main">Go Back to Main Page</a>
</body>
</html>