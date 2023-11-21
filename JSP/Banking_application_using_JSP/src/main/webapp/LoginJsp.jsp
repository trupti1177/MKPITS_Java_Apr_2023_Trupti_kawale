<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/2/2023
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Connection connection;
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Account","root","trupti1177");
    String Username = request.getParameter("username");
    String Password = request.getParameter("password");
    PreparedStatement preparedStatement = connection.prepareStatement("select * from User_Details where user_id=? and user_password=?");
    preparedStatement.setString(1,Username);
    preparedStatement.setString(2,Password);
    ResultSet resultSet = preparedStatement.executeQuery();
    PrintWriter printWriter = response.getWriter();
    if(resultSet.next()){
//        printWriter.println("<h2>Login Successful</h2>");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Myhtml.jsp");
        requestDispatcher.forward(request,response);
        HttpSession httpSession = request.getSession(true);
        httpSession.setAttribute("User_id",Username);
    }else{
        printWriter.println("<h2>Unable to login</h2>");
    }

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>