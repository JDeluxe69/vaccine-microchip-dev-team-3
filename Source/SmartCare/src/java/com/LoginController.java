/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LoginContext;

/**
 *
 * @author jakubmol
 */
public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname"); //TODO: Get this using body
        String passwd = request.getParameter("passwd");
        LoginContext ctx = new LoginContext();
        String currentPassword = ctx.getPassword(uname);

        if (currentPassword.equals(passwd)) {
            RequestDispatcher dispatcher = getServletContext()
                    .getRequestDispatcher("../adminDashboard.jsp");
            dispatcher.forward(request, response);

            response.sendRedirect(request.getContextPath() + "../adminDashboard.jsp");
//            processRequest(request, response);
        } else {
            out.println("Wrong input");
            response.sendRedirect(request.getContextPath() + "../adminLogin.jsp");
//            processRequest(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

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
