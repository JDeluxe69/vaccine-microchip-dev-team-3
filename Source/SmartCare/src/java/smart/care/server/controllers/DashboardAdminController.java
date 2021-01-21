/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.care.server.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import smart.care.comm.ContextKeys;
import smart.care.data.AppointmentContext;
import smart.care.data.AppointmentDto;
import smart.care.data.ClientContext;
import smart.care.data.ClientDto;
import smart.care.data.LoginContext;
import smart.care.gridview.GridViewBuilder;

/**
 *
 * @author jakubmol
 */
public class DashboardAdminController extends HttpServlet {



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
        ClientDto client = (ClientDto)request.getSession().getAttribute(ContextKeys.Client);
        if(client.getClientType().getCode() == 3)
        {
        
        // Clients  
        LoginContext ctx = new LoginContext();
        List<ClientDto> clients = null;
        try {
            clients = ctx.getClients();
        } catch (Exception ex) {
            Logger.getLogger(DashboardDoctorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Appointments
        AppointmentContext appCtx = new AppointmentContext();
        List<AppointmentDto> appointments = null;
        try {
            appointments = appCtx.getAppointments();
        } catch (Exception ex) {
            Logger.getLogger(DashboardDoctorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Calculate turnover
        double totalTurnover = 0;
        for(AppointmentDto appointment : appointments)
        {
            if(appointment.isIsPaid())
            {
                totalTurnover += appointment.getCharge();
            }
        }
        
        //Users to verify
        ClientContext clientCtx = new ClientContext();
        List<ClientDto> unverifiedClients = null;
        try {
            unverifiedClients = clientCtx.getUnferifiedClients();
        } catch (Exception ex) {
            Logger.getLogger(VerifyController.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        //Filter NHS clients
        List<ClientDto> nhsClients = new ArrayList<ClientDto>();
        for(ClientDto currentClient : clients)
        {
            if(currentClient.isIsNhs())
            {
                nhsClients.add(currentClient);
            }
        }
        
        request.setAttribute(ContextKeys.NhsClients, GridViewBuilder.BuildClientTable(nhsClients));
        request.setAttribute(ContextKeys.VerifyClients, GridViewBuilder.BuildDoctorTable(unverifiedClients));
        request.setAttribute(ContextKeys.TotalTurnover, String.format("%.2f", totalTurnover));
        request.setAttribute(ContextKeys.Table, GridViewBuilder.BuildClientTable(clients));
        request.getRequestDispatcher("/WEB-INF/adminDashboard.jsp").forward(request, response);
        }
        else{
            response.sendRedirect(request.getContextPath() +  "/dashboard");
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
