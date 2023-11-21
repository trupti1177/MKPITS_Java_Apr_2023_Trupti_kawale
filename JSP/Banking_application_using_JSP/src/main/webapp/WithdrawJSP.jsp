<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/3/2023
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  Connection connection;
  try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Account","root","trupti1177");
    int Amount = Integer.parseInt(request.getParameter("amount"));
    HttpSession httpSession = request.getSession(true);
    String Username = httpSession.getAttribute("User_id").toString();
    PreparedStatement preparedStatement = connection.prepareStatement("update User_Details set Balance=Balance-? where user_id=?");
    preparedStatement.setInt(1,Amount);
    preparedStatement.setString(2,Username);
    int result = preparedStatement.executeUpdate();
    if(result!=0){
      out.println("<h2 align=center>Withdraw amount successfully</h2>");
    }else{
      out.println("<h2 align=center>Unable to withdraw amount</h2>");
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