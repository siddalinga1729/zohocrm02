<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ include file="menu_lead.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
</head>
<body>
	<h3>List of All Contacts</h3>
	<table>
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>LeadSource</th>
			<th>Mobile</th>
			<th>Billing</th>
		</tr>
		<c:forEach items="${contacts}" var="contact">  
        <tr>
        <td>${contact.id}</td><!-- names should match with entity class -->
        <td><a href="getById?id=${contact.id}">${contact.firstName}</a></td>
        <td>${contact.lastName}</td>
        <td>${contact.email}</td>
        <td>${contact.leadsource}</td>
        <td>${contact.mobileNumber}</td>
        <td><a href="getcontactId?id=${contact.id}">generate Bill</a></td>
        </tr>
        </c:forEach> 
	</table>
</body>
</html>