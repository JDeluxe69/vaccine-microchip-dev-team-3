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
import smart.care.gridview.GridViewBuilder;
import smart.care.data.*;

/**
 *
 * @author jakubmol
 */
public class DashboardDoctorController extends HttpServlet {


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
        if((client.getClientType().getCode() == 0) || (client.getClientType().getCode() == 2))
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
        
        // Filter appointments
        List<AppointmentDto> clientAppointments = new ArrayList<AppointmentDto>();
        for(AppointmentDto appointment : appointments)
        {
            if(appointment.getHostId() == client.getId())
            {
                clientAppointments.add(appointment);
            }
        }
        

        request.setAttribute(ContextKeys.AppointmentsTable, GridViewBuilder.BuildAppointmentTable(clientAppointments));
        request.setAttribute(ContextKeys.Table, GridViewBuilder.BuildClientTable(clients));
        request.getRequestDispatcher("/WEB-INF/staffDashboard.jsp").forward(request, response);
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
