<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
    <title>SignIp</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2 class="mt-5" align="center">SignIN</h2>
    <form action="loginCheck" >
        <div class="form-group">
            <label for="username">USERNAME:</label>
            <input type="text" class="form-control"  name="username" required>
        </div>
        <div class="form-group">
            <label for="password">PASSWORD:</label>
            <input type="password" class="form-control"  name="password" required>
        </div>
     
            
      
        <button type="submit" class="btn btn-primary">SignIN</button>
    </form>
    <p class="mt-3">account New Acccount <a href="opensignup">SignUp in here</a>.</p>
</div>
</body>
</html>
