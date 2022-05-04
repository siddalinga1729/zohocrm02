<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ include file="menu_lead.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
<a href="viewLeadPage">Create New Lead</a>
	<h3>List of All Leads</h3>
	<table>
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>LeadSource</th>
			<th>Mobile</th>
		</tr>
		<c:forEach items="${leads}" var="lead">  
        <tr>
        <td>${lead.id}</td><!-- names should match with entity class -->
        <td><a href="getById?id=${lead.id}">${lead.firstName}</a></td>
        <td>${lead.lastName}</td>
        <td>${lead.email}</td>
        <td>${lead.leadsource}</td>
        <td>${lead.mobileNumber}</td>
        </tr>
        </c:forEach> 
	</table>
</body>
</html>