<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/1/2023
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%

    String nm=request.getParameter("name");
    String rn=request.getParameter("rollNumber");
    String ad=request.getParameter("address");
    String ct=request.getParameter("city");

 Class.forName("com.mysql.cj.jdbc.Driver");

Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetails","root","trupti1177");

    PreparedStatement preparedStatement=connection.prepareStatement ("insert into studet_information values(?,?,?,?)");
    preparedStatement.setString(1,rn);
    preparedStatement.setString(2,nm);
    preparedStatement.setString(3,ad);
    preparedStatement.setString(4,ct);

    int rv=preparedStatement.executeUpdate();
    PrintWriter printWriter=response.getWriter();
    if(rv!=0)
        printWriter.println("inserted");
    else
        printWriter.println("not inserted");
    %>




<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="yourjsp.jsp">Display</a>
</body>
</html>
