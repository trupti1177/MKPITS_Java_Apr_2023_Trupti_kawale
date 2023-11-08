/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import BankApplication.BankApplication;
import ServiceClass.ServiceClass;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shubh
 */
public class WithdrawServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            int Amount = Integer.parseInt(request.getParameter("amount"));
            HttpSession httpSession = request.getSession(true);
            String user_id = httpSession.getAttribute("Username").toString();
            
            BankApplication bankApplication = new BankApplication();
            bankApplication.setBalance(Amount);
            bankApplication.setUsername(user_id);
           
            ServiceClass serviceClass = new ServiceClass();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>WithdrawServlet</title>");
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" >");
            out.println("<style>"
                    + "body{"
                    + "background-color: background: rgb(186,146,241);\n" +
"               background: radial-gradient(circle, rgba(186,146,241,0.7736344537815126) 0%, rgba(203,245,133,0.7176120448179272) \n" +
"                   100%);"
                    + "}</style>");
            out.println("</head>");
            out.println("<body>");
            if(serviceClass.withdrawAmount(bankApplication)!=0){
                out.println("<h2 align=center class='mt-5'>Amount withdraw successfully</h2>");
                out.println("<a href='Myhtml.html' class='fs-3 text-gray d-flex justify-content-center text-decoration-none mt-3' align=center>Back</a>");
            }else
                out.println("<h2>Unable to withdraw amount</h2>");
            out.println("</body>");
            out.println("</html>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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