package com.example.demo_jsp3;

import java.sql.*;

public class StudentService {
    Connection connection;
    public StudentService() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDetails","root","trupti1177");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public int insertRecord(Student student) throws SQLException {

        int result=0;

        PreparedStatement preparedStatement= connection.prepareStatement("Insert into studet_information values (?,?,?,?)");
        preparedStatement.setString(1,student.getName());
        preparedStatement.setString(2,student.getRollnumber());
        preparedStatement.setString(3,student.getAddress());
        preparedStatement.setString(4,student.getCity());

        result=preparedStatement.executeUpdate();
        return result;

    }
    public ResultSet getRecord() throws SQLException {
        ResultSet resultSet=null;
        Statement statement=connection.createStatement();
      resultSet=  statement.executeQuery("select * from studet_information  ");
      return resultSet;

    }
}
