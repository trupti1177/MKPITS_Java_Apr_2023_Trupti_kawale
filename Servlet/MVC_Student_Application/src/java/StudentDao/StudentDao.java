/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDao;

import Student.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class StudentDao {
    static Connection connection;
    int result=0;
    public StudentDao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_information", "root","trupti1177");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        
    }
    public int insertData(Student student){
        try{
            
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Student_detail values(?,?,?,?)");
            preparedStatement.setString(1, student.getRollno());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getAddress());
            preparedStatement.setString(4, student.getCity());
            result = preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return result;
    }
    
}