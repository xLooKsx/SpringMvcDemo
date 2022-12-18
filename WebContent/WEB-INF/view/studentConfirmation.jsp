<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student registration Confirmation</title>
</head>
<body>
	<h2>The Student ${student.firstName} ${student.lastName} was registered</h2>
	<p>Country: ${student.country} </p>
	<p>Favorite Programming Language: ${student.favoriteLanguage} </p>
	<!-- iterate of a operatingSystems list -->
	Operating Systems:
	<ul>
		<c:forEach items="${student.operatingSystems}" var="sys">		
			<li>${sys}</li>
		</c:forEach>
	</ul>
	
<%-- 	prints memory address
	<p>You can use: ${student.operatingSystems} </p> --%>
	<br><br/>
	<a href="/SpringMvcDemo">>Voltar</a>
</body>
</html>