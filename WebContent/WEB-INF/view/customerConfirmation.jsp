<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>customer confirmation</title>
	</head>
	<body>
		The Customer is confirmed: ${customer.firstName} ${customer.lastName}
		<br><br>
		Free passes: ${customer.freePasses}
		<br><br>
		Postal code: ${customer.postalCode}
		<br><br/>
		Course code: ${customer.courseCode}
		<br><br/>
		<a href="/SpringMvcDemo">>Voltar</a>
	</body>
</html>