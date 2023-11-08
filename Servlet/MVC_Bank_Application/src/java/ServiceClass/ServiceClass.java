/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceClass;

import BankApplication.BankApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class ServiceClass {
    static Connection connection;
    int result = 0;
    ResultSet resultSet;
    
    public ServiceClass(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Account", "root", "trupti1177");

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
    public int insertRecord(BankApplication bankApplication){
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareCall("insert into User_Details values(?,?,?,?,?,?)");
            preparedStatement.setString(1, bankApplication.getUsername());
            preparedStatement.setString(2,bankApplication.getPassword());
            preparedStatement.setString(3,bankApplication.getName());
            preparedStatement.setString(4,bankApplication.getAddress());
            preparedStatement.setString(5,bankApplication.getCity());
            preparedStatement.setInt(6,bankApplication.getBalance());
            result = preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) {
              System.out.println(ex);
        }
        return result;
    }
    
    public ResultSet loginMethod(BankApplication bankApplication){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from User_Details where user_id=? and user_password=?");
            preparedStatement.setString(1, bankApplication.getUsername());
            preparedStatement.setString(2, bankApplication.getPassword());
             resultSet = preparedStatement.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultSet;
    }
    
    public int depositAmount(BankApplication bankApplication){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update User_Details set Balance = Balance + ? where user_id=?");
            preparedStatement.setString(2, bankApplication.getUsername());
            preparedStatement.setInt(1, bankApplication.getBalance());
            result = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
        
    }
    
    public int withdrawAmount(BankApplication bankApplication){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update User_Details set Balance = Balance - ? where user_id=?");
            preparedStatement.setString(2, bankApplication.getUsername());
            preparedStatement.setInt(1, bankApplication.getBalance());
            result = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return result;
    }
}