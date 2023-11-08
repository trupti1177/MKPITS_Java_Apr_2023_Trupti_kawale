/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudDao;

import Stud.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class StudentDao {
    Connection con;
    
    public StudentDao() throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatails","root","trupti1177");
            
               
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }
    public int insertRecord(Student student){
        int r=0;
        try{
            
            PreparedStatement pstat=con.prepareStatement ("insert into student details values(?,?,?,?)");
            pstat.setString(1, student.getRollno());
            pstat.setString(2, student.getName());
            pstat.setString(3, student.getAddress());
            pstat.setString(4, student.getCity());
            r=pstat.executeUpdate();
                    
           }catch(SQLException e){
               System.out.println(e);
           }
           return r;
    }
    public ResultSet getRecords(){
        ResultSet rs=null;
        try{
            Statement stat=con.createStatement();
            stat.executeQuery("");
        }catch(SQLException e){
            System.out.println(e);
                    
        }
        return rs;
    }
}
