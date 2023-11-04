<%@ page import="com.example.demo_jsp3.StudentService" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11/3/2023
  Time: 5:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<jsp:useBean id="s" class="com.example.demo_jsp3.Student" scope="application"/>

<jsp:setProperty name="s" property="name" param="name"/>
<jsp:setProperty name="s" property="rollnumber" param="rollNumber"/>
<jsp:setProperty name="s" property="address" param="address"/>
<jsp:setProperty name="s" property="city" param="city"/>




<%

    StudentService studentService=new StudentService();
  if(  studentService.insertRecord(s)!=0)
  {
      out.println("Data Inserted ");
  }
else
      out.println("Data not Inserted ");


%>




<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="Myjsp.jsp">display</a>
</body>
</html>
