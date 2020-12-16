/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import smart.care.data.LoginContext;
import smart.care.data.UserEntity;

/**
 *
 * @author jakubmol
 */
public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
        
        String login = request.getParameter("username"); //TODO: Get this using body
        String password = request.getParameter("password");
        LoginContext ctx = new LoginContext();
        String currentPassword = ctx.getPassword(login);
        
        if(currentPassword.equals(password)){    
           // RequestDispatcher dispatcher = getServletContext()
           //     .getRequestDispatcher("/dashboard.jsp");
          //  dispatcher.forward(request, response);
            
            response.sendRedirect(request.getContextPath() +  "/adminDashboard.jsp");
            processRequest(request, response);
        }else
        {
         response.sendRedirect(request.getContextPath() + "/adminLogin.jsp");
         processRequest(request, response);
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
