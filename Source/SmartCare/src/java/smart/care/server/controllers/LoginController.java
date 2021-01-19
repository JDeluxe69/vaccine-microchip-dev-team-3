/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.care.server.controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import smart.care.comm.ContextKeys;
import smart.care.data.ClientDto;
import smart.care.data.LoginContext;

/**
 *
 * @author jakubmol
 */
public class LoginController extends HttpServlet {

    
    public LoginController()
    {
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
         request.getRequestDispatcher("/WEB-INF/adminLogin.jsp").forward(request, response);
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
        ClientDto client;
       
        try {
            client = ctx.getClient(login);
        } catch (Exception ex) {
            client = null;
        }
        
        if((client != null) && (client.getPassword().equals(password))){    
           // RequestDispatcher dispatcher = getServletContext()
           //     .getRequestDispatcher("/dashboard.jsp");
          //  dispatcher.forward(request, response);
            
          
                HttpSession session=request.getSession();  
                session.setAttribute(ContextKeys.Client,client);  
          
              
            //response.sendRedirect(request.getContextPath() +  "/dashboard.jsp");
            //processRequest(request, response);
            
            request.getRequestDispatcher("/dashboard").forward(request, response);
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
