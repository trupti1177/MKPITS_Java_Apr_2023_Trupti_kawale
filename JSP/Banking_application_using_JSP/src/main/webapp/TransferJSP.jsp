<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/3/2023
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%@ page import="java.io.PrintWriter" %>
<%
    Connection connection;
    int result;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Account","root","trupti1177");

        String Username = request.getParameter("username");
        int Amount = Integer.parseInt(request.getParameter("amount"));
        HttpSession httpSession = request.getSession(true);
        String loginUserId = httpSession.getAttribute("User_id").toString();
        String TransactionType1 = "TransferIn";
        String TransactionType2 = "TransferOut";
        Date date = new java.sql.Date(httpSession.getCreationTime());

//============ Transaction TransferIn Amount (add) Inserted in Another user account from LoginUser Account insert query =======================
        PreparedStatement preparedStatement = connection.prepareStatement("insert into Transactions values(?,?,?,?)");
        preparedStatement.setString(1,Username);
        preparedStatement.setDate(2,date);
        preparedStatement.setInt(3,Amount);
        preparedStatement.setString(4,TransactionType1);
        result = preparedStatement.executeUpdate();
        PrintWriter printWriter = response.getWriter();
        if(result!=0){
            printWriter.println("<h3 align=center>Transaction TransferIn data inserted successfully</h3>");
        }else {
            printWriter.println("<h3 align=center>Unable to insert transaction transferIn data</h3>");
        }

//=========== Transaction TransferOut Amount(minus) from LoginUser account and to (Add) Another user account Insert query =======================================================
        PreparedStatement preparedStatement1 = connection.prepareStatement("insert into Transactions values(?,?,?,?)");
        preparedStatement1.setString(1,loginUserId);
        preparedStatement1.setDate(2,date);
        preparedStatement1.setInt(3,Amount);
        preparedStatement1.setString(4,TransactionType2);
        result = preparedStatement1.executeUpdate();
        if(result!=0){
            printWriter.println("<h3 align=center>Transaction TransferOut data inserted successfully</h3>");
        }else {
            printWriter.println("<h3 align=center>Unable to insert transaction transferOut data</h3>");
        }

        //
        PreparedStatement preparedUpdateStatement = connection.prepareStatement("update User_Details set Balance = Balance - ? where user_id=?");
        preparedUpdateStatement.setString(2,loginUserId);
        preparedUpdateStatement.setInt(1,Amount);
        result = preparedUpdateStatement.executeUpdate();
        if(result!=0){
            printWriter.println("<h3 align=center>loginUser Balance updated successfully</h3>");
        }else {
            printWriter.println("<h3 align=center>Unable to update balance</h3>");
        }

        PreparedStatement preparedUpdateStatement1 = connection.prepareStatement("update User_Details set Balance = Balance + ? where user_id=?");
        preparedUpdateStatement1.setString(2,Username);
        preparedUpdateStatement1.setInt(1,Amount);
        result = preparedUpdateStatement1.executeUpdate();
        if(result!=0){
            printWriter.println("<h3 align=center>User Balance updated successfully</h3>");
        }else
        {
            printWriter.println("<h3 align=center>Unable to update balance</h3>");
        }

    } catch (Exception e) {
        out.println(e);
    }
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" >
    <style>
        body{
            /*background: rgb(131,58,180);*/
            /*background: linear-gradient(90deg, rgba(131,58,180,1) 0%, rgba(29,233,253,0.5495448179271709) 50%, rgba(252,176,69,1) 100%);*/
            background: rgb(131,58,180);
            background: linear-gradient(90deg, rgba(131,58,180,1) 0%, rgba(155,228,235,0.5495448179271709) 50%, rgba(150,211,199,0.7008053221288515) 100%);
            margin-top: 50px;
        }
        .back{
            font-size: 30px;
            text-decoration: none;
            color: darkred;
            font-weight: bolder;
        }
    </style>
</head>
<body>
<a href="Myhtml.jsp" class="d-flex justify-content-center back" >Back</a>
</body>
</html>