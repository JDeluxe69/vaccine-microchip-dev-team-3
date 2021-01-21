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
import smart.care.comm.ClientType;
import smart.care.comm.ContextKeys;
import smart.care.data.AppointmentContext;
import smart.care.data.AppointmentDto;
import smart.care.data.ClientDto;
import smart.care.data.LoginContext;
import smart.care.gridview.GridViewBuilder;

/**
 *
 * @author jakubmol
 */
public class DashboardPatientController extends HttpServlet {


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
        if(client.getClientType().getCode() == 1)
        {
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
            if(appointment.getPatientId() == client.getId())
            {
                clientAppointments.add(appointment);
            }
        }
        
        
        // Clients  
        LoginContext ctx = new LoginContext();
        List<ClientDto> clients = null;
        try {
            clients = ctx.getClients();
        } catch (Exception ex) {
            Logger.getLogger(DashboardDoctorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Filter staff
        List<ClientDto> nhsClients = new ArrayList<ClientDto>();
        for(ClientDto currentClient : clients)
        {
            if((currentClient.getClientType() == ClientType.NURSE) || (currentClient.getClientType() == ClientType.DOCTOR))
            {
                nhsClients.add(currentClient);
            }
        }
        
        request.setAttribute(ContextKeys.NhsClients, GridViewBuilder.BuildDoctorTable(nhsClients));
        request.setAttribute(ContextKeys.AppointmentsTable, GridViewBuilder.BuildAppointmentTable(clientAppointments)); 
        request.setAttribute(ContextKeys.MyId, client.getId());   
        request.getRequestDispatcher("/WEB-INF/PatientDashboard.jsp").forward(request, response);
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
