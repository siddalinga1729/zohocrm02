<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Generate Bill</title>
</head>
<body>
	<form action="generateBill" method="post">
		<pre>
FirstName:<input type="text" name="firstName" value="${contact.firstName }">
			<!-- name values should match with entity class variable names -->
LastName:<input type="text" name="lastName"value="${contact.lastName }">
Email:<input type="text" name="email"value="${contact.email }">
Mobile:<input type="text" name="mobileNumber" value="${contact.mobileNumber }">
ProductName:<input type="text" name="productName">
Amount:<input type="text" name="amount">
<input type="submit" value="GenerateBill">
</pre>
	</form>
</body>
</html>