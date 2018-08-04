<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib url="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>NIC</td>
			<td>Designation</td>
			<td>Company</td>
			<td>Email</td>
			<td>Update</td>
			<td>Delete</td>
			
		</tr>
		<c:forEach items="${employee }" var="emp">
		<tr>
			<td>${emp.employeeId }</td>
			<td>${emp.employeeName }</td>
			<td>${emp.nic }</td>
			<td>${emp.Designation }</td>
			<td>${emp.company }</td>
			<td>${emp.email }</td>
			<td><a href="?id"+{emp.employeeId}></a>Update</td>
			<td><a href="?id"+{emp.employeeId}></a>Delete</td>
			
		</tr>
		
		</c:forEach>
		
	</table>

</body>
</html>