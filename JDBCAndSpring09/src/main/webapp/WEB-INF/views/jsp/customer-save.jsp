<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Spring MVC + JDBC</title>

</head>
<body>

	<a href="<c:url value="/customer-list"/>">List Customer</a>

	<h1>Add new Customer</h1>
	<c:url value="/saveCustomer" var="saveCustomer"/>
	<form:form action="${saveCustomer}" method="POST" modelAttribute="customer">
			Name:<form:input path="name"/><br/>	
			Address:<form:input path="address"/><br/>	
			<button type="submit">Submit</button>
	</form:form>
</body>
</html>