/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shubh
 */
public class BalanceStatementOfUser extends HttpServlet {

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
            Class.forName("com.mysql.cj.jdbc.Driver");
//            out.println("driver loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankDeatails", "root", "trupti1177");
//            out.println("connection established");
            
            out.println("<h1 align=center>Welcome</h1>");
            HttpSession httpSession = request.getSession(true);
            out.println("<h2 align=center>UserId : " +httpSession.getAttribute("user_id").toString()+"</h2>");
            
            PreparedStatement preparedStatement = connection.prepareStatement("select transacction_Date,Amount,TransType from Transactions where UserID=?");
            preparedStatement.setString(1, httpSession.getAttribute("user_id").toString());
            ResultSet resultSet = preparedStatement.executeQuery();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Balance statement</title>"); 
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" "
                    + "rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" "
                    + "crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<table class='container table-success table-bordered table-striped table table-lg table-hover'>");
            out.println("<tr class='table table-group-divider'>"
                    + "<th>Transaction_Date</th>"
                    + "<th>Amount</th>"
                    + "<th>Transaction_Type</th>"
                    + "</tr>");
            while(resultSet.next()){
                out.println("<tr>"
                        + "<td>"+resultSet.getDate(1)+"</td>"
                        + "<td>"+resultSet.getInt(2)+"</td>"
                        + "<td>"+resultSet.getString(3)+"</td>"
                        + "</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            
            
//------------------------ Display total balance ---------------------------------------
            preparedStatement=connection.prepareStatement("select Balance from User_Details where user_id=?");
            preparedStatement.setString(1,httpSession.getAttribute("user_id").toString());
            ResultSet totalBalanceResultSet = preparedStatement.executeQuery();
            if(totalBalanceResultSet.next()){
                out.println("<h2 align=center>Total Balance : "+totalBalanceResultSet.getInt(1)+"</h2>");
            }else{
                out.println("<h2 align=center>Unknown user</h2>");
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BalanceStatementOfUser.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BalanceStatementOfUser.class.getName()).log(Level.SEVERE, null, ex);
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