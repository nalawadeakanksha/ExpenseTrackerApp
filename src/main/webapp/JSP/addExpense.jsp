<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
    <title></title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<h1>Add Expense</h1>
<div class="container">
    <h2 class="mt-5">ADDEXPENSE</h2>
    <form action="addExpense" >
        <div class="form-group">
            <label for="category">category:</label>
            <input type="text" class="form-control"  name="category" required>
        </div>
        <div class="form-group">
            <label for="amount">amount:</label>
            <input type="number" class="form-control"  name="amount" required>
        </div>
         <div class="form-group">
            <label for="comments">comments:</label>
            <input type="text" class="form-control"  name="comments" required>
        </div>
        <button type="submit" class="btn btn-primary">Signup</button>
    </form>
    <p class="mt-3">Already have an account? <a href="opensignin">Sign in here</a>.</p>
</div>
</body>
</html>
