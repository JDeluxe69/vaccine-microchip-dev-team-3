/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.care.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.ValidationException;
import smart.care.comm.ClientType;

/**
 *
 * @author jakubmol
 */
public class AppointmentContext {
    
    public List<AppointmentDto> getAppointments() throws Exception
    {
        String url = "jdbc:derby://localhost:1527/SmartCare"; 
        Properties info = new Properties(); 
        info.put("user", "admin1"); 
        info.put("password", "1234"); 
        String sql = String.format("SELECT * FROM APP.APPOINTMENT");        
        Connection dbConnection;
        try {
             dbConnection = DriverManager.getConnection(url, info);
             ResultSet results = dbConnection.prepareCall(sql).executeQuery();
             List<AppointmentDto> appointments = clientBuilder(results);
             return appointments;
        } catch (SQLException ex) {
            Logger.getLogger(LoginContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private List<AppointmentDto> clientBuilder(ResultSet results)
    {
        List<AppointmentDto> appointments = new ArrayList<AppointmentDto>();
        try {
             while(results.next())
             {
                AppointmentDto appointment = new AppointmentDto();
                appointment.setId(results.getInt(AppointmentTableKeys.Id));
                appointment.setHostId(results.getInt(AppointmentTableKeys.HostId));
                appointment.setPatientId(results.getInt(AppointmentTableKeys.PatientId));
                appointment.setComments(results.getString(AppointmentTableKeys.Comments));
                appointment.setAppointmentStart(results.getDate(AppointmentTableKeys.AppointmentStart));
                appointment.setAppointmentDuration(results.getTime(AppointmentTableKeys.AppointmentDuration));
                appointment.setCharge(results.getDouble(AppointmentTableKeys.Charge));
                appointment.setIsComplete(toBoolean(results.getInt(AppointmentTableKeys.IsComplete)));   
                appointment.setIsPaid(toBoolean(results.getInt(AppointmentTableKeys.IsPaid)));
                appointments.add(appointment);
             }
        } catch (SQLException ex) {
            Logger.getLogger(LoginContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return appointments;
    }
    
        private boolean toBoolean(int value)
    {
        switch(value){
            case 0:
                return false;
            case 1: 
                return true; 
            default:
                throw new ValidationException();
        }
    }
}
