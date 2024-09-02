<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
    <title>Signup</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<h1>EDIT Expense</h1>
<div class="container">
    <h2 class="mt-5">EDIT-EXPENSE</h2>
    <form action="updateExpenses" >
    <div class="form-group">
            <label for="id">id:</label>
            <input type="hidden" class="form-control"  name="id" value="${e.id}" required>
        </div>
        <div class="form-group">
            <label for="category">category:</label>
            <input type="text" class="form-control"  name="category" value="${e.category}" required>
        </div>
        <div class="form-group">
            <label for="amount">amount:</label>
            <input type="number" class="form-control"  name="amount"  value="${e.amount}"required>
        </div>
         <div class="form-group">
            <label for="comments">comments:</label>
            <input type="text" class="form-control"  name="comments" value="${e.comments}" required>
        </div>
        <button type="submit" class="btn btn-primary">UPDATE</button>
    </form>
    
</div>
</body>
</html>
