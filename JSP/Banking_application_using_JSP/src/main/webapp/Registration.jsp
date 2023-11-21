<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/3/2023
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >
    <style>
        body{
            background: rgb(131,58,180);
            background: linear-gradient(90deg, rgba(131,58,180,1) 0%, rgba(155,228,235,0.5495448179271709) 50%, rgba(150,211,199,0.7008053221288515) 100%);
        }
        .main{
            border: 3px solid black;
            box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
        }
    </style>
</head>
<body>
<div class="container col-lg-4 mt-2 main">
    <h2 align="center" class="mt-3 mb-3">Registration form</h2>
    <form action="insertData.jsp" method="post">
        <label>User_id : </label>
        <input type="text" name="username" class="form-control">
        <br>
        <label>Password : </label>
        <input type="password" name="password" class="form-control">
        <br>
        <label>Name : </label>
        <input type="text" name="name" class="form-control">
        <br>
        <label>Address : </label>
        <input type="text" name="address" class="form-control">
        <br>
        <label>City : </label>
        <input type="text" name="city" class="form-control">
        <br>
        <label>Balance : </label>
        <input type="text" name="balance" class="form-control">
        <br>
        <div align="center">
            <input type="submit" name="Submit" class="btn btn-primary">
        </div>
    </form>
</div>
</body>
</html>