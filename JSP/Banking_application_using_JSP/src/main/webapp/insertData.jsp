<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/3/2023
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Connection connection;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Account","root","trupti1177");

        String user_id = request.getParameter("username");
        String Password = request.getParameter("password");
        String Name = request.getParameter("name");
        String Address = request.getParameter("address");
        String City = request.getParameter("city");
        double Balance = Integer.parseInt(request.getParameter("balance"));

        PreparedStatement preparedStatement = connection.prepareStatement("insert into User_Details values (?,?,?,?,?,?)");
        preparedStatement.setString(1,user_id);
        preparedStatement.setString(2,Password);
        preparedStatement.setString(3,Name);
        preparedStatement.setString(4,Address);
        preparedStatement.setString(5,City);
        preparedStatement.setDouble(6,Balance);
        int result = preparedStatement.executeUpdate();
        PrintWriter printWriter = response.getWriter();

        if(result!=0)
            printWriter.println("<h2>Record inserted Successfully</h2>");
        else
            printWriter.println("<h2>Unable to insert Record</h2>");
    } catch (Exception e) {
        out.println(e);
    }

%>
<html>
<head>
    <title>Insert Data</title>
</head>
<body>

</body>
</html>