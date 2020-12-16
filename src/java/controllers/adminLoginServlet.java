package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bupal
 */
public class adminLoginServlet extends HttpServlet {

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

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //doPost method
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Accept username and password
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // database
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SmartCare", "root", "root");

            // Get data from adminLogin.jsp 
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from admin where uname = '"+username+"' and upassword = '"+password+"'");

            if (rs.next()) {
                // if username and password true than go to adminDashboard.jsp
//                response.sendRedirect("adminDashboard.jsp");
                response.sendRedirect("index.html");
            } else {
                out.println("Wrong username and password...");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
