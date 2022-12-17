<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	
		First Name: <form:input path="firstName"/>
		<br><br>
		Last Name: <form:input path="lastName"/>
		<br><br>
		Country:
		<form:select path="country">
<!-- 		values added by list -->
			<form:options items="${student.countryOptions}"/>
			<%-- values added to drop down list manually
			<form:option value="BR" label="Brazil" /> 
			<form:option value="FR" label="France" />
			<form:option value="USA" label="United States of America" />
			<form:option value="PT" label="Portugal" />
			<form:option value="CA" label="Canada" /> --%>
		</form:select>
		<br><br>
		Favorite Language:<br>
<!-- 		values added by list -->
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
<%-- 		values added to radio button manually
			<form:radiobutton path="favoriteLanguage" value="Java"/>Java<br> --%>
<%-- 		<form:radiobutton path="favoriteLanguage" value="PHP"/>PHP<br> --%>
<%-- 		<form:radiobutton path="favoriteLanguage" value="C#"/>C#<br> --%>
<%-- 		<form:radiobutton path="favoriteLanguage" value="Ruby"/>Ruby --%>
		<br><br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>