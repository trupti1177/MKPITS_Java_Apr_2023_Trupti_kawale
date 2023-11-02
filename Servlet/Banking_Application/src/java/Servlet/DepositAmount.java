/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dell
 */
public class DepositAmount extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static Connection connection;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
            int Deposit = Integer.parseInt(request.getParameter("deposit"));
            String transactionType = "Deposit";
            HttpSession httpSession = request.getSession(true);
            String UserName = httpSession.getAttribute("user_id").toString();
            Date date = new java.sql.Date(httpSession.getCreationTime());
            
            Class.forName("com.mysql.cj.jdbc.Driver");
//            out.println("Driver loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatails", "root", "trupti1177");
//            out.println("connection established");
            
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Transactions values(?,?,?,?)");
            preparedStatement.setString(1, UserName);
            preparedStatement.setDate(2, date);
            preparedStatement.setInt(3, Deposit);
            preparedStatement.setString(4, transactionType);
            int resultSet = preparedStatement.executeUpdate();
            
            if(resultSet!= 0){
                out.println("<h1 align=center>Amount inserted successfully</h1>");
            }else{
                out.println("<h2 align=center>unable to insert amount</h2>");
            }
            
            PreparedStatement preparedUpdateStatement = connection.prepareStatement("update User_Details set Balance=Balance+? where user_id=?");
            preparedUpdateStatement.setString(2, UserName);
            preparedUpdateStatement.setInt(1, Deposit);
            int updateResultSet = preparedUpdateStatement.executeUpdate();
            if(updateResultSet != 0){
                out.println("<h1 align=center>Balance updated</h1>");
            }else{
                out.println("<h2 align=center>Unable to update Balance</h2>");
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepositAmount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepositAmount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepositAmount.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepositAmount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}