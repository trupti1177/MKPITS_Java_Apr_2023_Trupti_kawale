<%@ page import="com.example.demo_jsp3.StudentService" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/3/2023
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    StudentService studentService=new StudentService();
    ResultSet resultSet=studentService.getRecord();

%>

<%
    while (resultSet.next()){


%>

<%= resultSet.getString(1)%>
<%= resultSet.getString(2)%>
<%= resultSet.getString(3)%>
<%= resultSet.getString(4)%>

<%
    }

%>




<html>
<head>

    <title>Title</title>

</head>
<body>

</body>
</html>
