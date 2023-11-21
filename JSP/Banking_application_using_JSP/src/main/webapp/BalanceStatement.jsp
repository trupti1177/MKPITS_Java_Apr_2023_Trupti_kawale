<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/3/2023
  Time: 3:21 PM
   To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
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
            margin-top: 10px;
        }
    </style>
</head>
<body>
<%
    HttpSession httpSession = request.getSession(true);
%>
<h3 align="center">Welcome</h3>
<h3 align="center">Username : <%=httpSession.getAttribute("User_id").toString()%></h3>
<table align="center"  cellpadding="8" class="col-lg-6 table table-info table-hover table-borderless">

    <%
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Account","root","shubham@123");
//        PreparedStatement preparedStatement = connection.prepareStatement("select * from Transactions");
            PreparedStatement preparedStatement = connection.prepareStatement("select transacction_Date,Amount,TransType from Transactions");
            preparedStatement.setString(1,httpSession.getAttribute("User_id").toString());
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
    %>
    <%--    <tr>--%>
    <%--        <%--%>
    <%--            for(int columnIndex = 1; columnIndex<=resultSetMetaData.getColumnCount(); columnIndex++)--%>
    <%--            {--%>
    <%--        %>--%>
    <%--        <th><%=resultSetMetaData.getColumnName(columnIndex)%></th>--%>
    <%--        <%--%>
    <%--            }--%>
    <%--        %>--%>
    <%--    </tr>--%>
    <tr>
        <th><%=resultSetMetaData.getColumnName(1)%></th>
        <th><%=resultSetMetaData.getColumnName(2)%></th>
        <th><%=resultSetMetaData.getColumnName(3)%></th>
    </tr>
    <%
        while (resultSet.next())
        {
    %>
    <tr>
        <td><%=resultSet.getString(1)%></td>
        <td><%=resultSet.getString(2)%></td>
        <td><%=resultSet.getString(3)%></td>
    </tr>
    <%
            }
        } catch (Exception e) {
            out.println(e);
        }

    %>
</table>
</body>
</html>