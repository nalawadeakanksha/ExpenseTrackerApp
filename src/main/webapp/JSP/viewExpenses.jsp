<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table,th,td,tr {
	border:3px solid red;
	border-collapse: collapse;
}
th{
background-color:green;
}

</style>

</head>
<body>

<a href="openaddExpenses">ADDEXPENSE</a>
<table>
		<tr>
			
			<th>ExpenseId</th>
			<th>category</th>
			<th>Ammount</th>
			<th>Comments</th>
			<th>Action</th>
		</tr>

		
			<tr>
				<td>${u.expense.id}</td>
				<td>${u.expense.category}</td>
				<td>${u.expense.amount}</td>
				<td>${u.expense.comments}</td>
				<td><a href="deleteExpenses?id=${u.uid}">DELETE</a>||<a
					href="editExpenses?id=${u.expense.id}">EDIT</a></td>
			</tr>
	
	</table>
</body>
</html>