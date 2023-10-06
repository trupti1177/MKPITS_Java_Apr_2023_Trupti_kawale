package DBConnectivity;

import java.sql.*;

public class DatabaseConnectivity {
    static Connection connection;
    public static void dbcorn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_details","root","shubham@123");
            System.out.println("Connection established");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void displayData(){
        try {
            dbcorn();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+ " " + resultSet.getString(2) + " " +
                        resultSet.getString(3) + " " + resultSet.getString(4) + " " +
                        resultSet.getString(5) + " " + resultSet.getString(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void insertData(String emplyeeId, String name, String age, String mobileNo, String address, String city){
        try {
            dbcorn();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into employee values(?,?,?,?,?,?)");
            preparedStatement.setString(1,emplyeeId);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,age);
            preparedStatement.setString(4,mobileNo);
            preparedStatement.setString(5,address);
            preparedStatement.setString(6,city);
            int returnValue = preparedStatement.executeUpdate();
            if(returnValue!=0){
                System.out.println("Record inserted");
            }else{
                System.out.println("unable to insert record");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void updateData(String emplyeeId, String name, String age, String mobileNo, String address, String city){
        try {
            dbcorn();
            PreparedStatement preparedStatement = connection.prepareStatement("update employee set city=? where emplyeeId=?");
            preparedStatement.setString(6,city);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteData(String employeeId){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from employee where employeeId=?");
            preparedStatement.setString(1,employeeId);
            int returnValue = preparedStatement.executeUpdate();
            if(returnValue!=0)
                System.out.println("record deleted");
            else
                System.out.println("unable to delete record");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}