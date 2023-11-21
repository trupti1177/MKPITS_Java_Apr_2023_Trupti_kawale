<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/3/2023
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Withdraw</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >
    <style>
        body{
            background: rgb(131,58,180);
            background: linear-gradient(90deg, rgba(131,58,180,1) 0%, rgba(155,228,235,0.5495448179271709) 50%, rgba(150,211,199,0.7008053221288515) 100%);
        }
        .main{
            border: 3px solid black;
            box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
            border-radius: 10px;
        }
    </style>
</head>
<body>
<div class="container mt-5 mb-4 col-lg-4 p-5 main" align="center">
    <form action="WithdrawJSP.jsp" method="post">
        <label><h3>Amount :</h3></label>
        <br>
        <input type="number" name="amount">
        <br>
        <br>
        <div align="center">
            <input type="submit" value="Withdraw" class="btn btn-success fs-5 text-white">
        </div>
    </form>
</div>
</body>
</html>