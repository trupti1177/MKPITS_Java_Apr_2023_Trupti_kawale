<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/3/2023
  Time: 3:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Transfer Money</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >
    <style>
        .main{
            border-radius: 10px;
            box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;

        }
        body{
            margin-top: 100px;
            background: rgb(131,58,180);
            background: linear-gradient(90deg, rgba(131,58,180,1) 0%, rgba(155,228,235,0.5495448179271709) 50%, rgba(150,211,199,0.7008053221288515) 100%);
        }

    </style>
</head>
<body>
<div class="container col-lg-4 mt-2 p-4 main">
    <h4 align="center" class="mt-3 mb-3">Money Transfer</h4>
    <form action="TransferJSP.jsp" method="post">
        <label>Username : </label>
        <input type="text" name="username" class="form-control">
        <br>
        <label>Amount : </label>
        <input type="number" name="amount" class="form-control">
        <div align="center">
            <br>
            <input type="submit" value="Transfer" class="btn btn-success mb-1">
            <%--      <br>--%>
            <%--      Sign Up :--%>
            <%--      <a href="Registration.jsp">click here to register</a>--%>
        </div>
    </form>
</div>
</body>
</html>