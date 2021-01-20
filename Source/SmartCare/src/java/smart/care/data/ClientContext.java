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
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jakubmol
 */
public class ClientContext {
    public boolean deactivateClient(String id) throws Exception
    {
        String url = "jdbc:derby://localhost:1527/SmartCare"; 
        Properties info = new Properties(); 
        info.put("user", "admin1"); 
        info.put("password", "1234"); 
        String sql = String.format("Update APP.CLIENT Set IS_ACTIVE = 0 where CLIENT_ID = %s", id);        
        Connection dbConnection;
        try {
             dbConnection = DriverManager.getConnection(url, info);
             int results = dbConnection.prepareCall(sql).executeUpdate();
             return true;
        } catch (SQLException ex) {
            Logger.getLogger(LoginContext.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean insertClient(String login, String  password, String  fullName, String address, String dob, int isNhs, int clientType)
    {
        // Set requirement for doctors to be verified
        int isActive = 1;
        int isVerified = 1;
        if(clientType == 0)
        {
            isVerified = 0;
        }
        String url = "jdbc:derby://localhost:1527/SmartCare"; 
        Properties info = new Properties(); 
        info.put("user", "admin1"); 
        info.put("password", "1234"); 
        String sql = String.format("INSERT INTO APP.CLIENT (NAME, PASSWORD, USERNAME, CLIENT_TYPE, ADDRESS, DOB, IS_VERIFIED, IS_ACTIVE, IS_NHS) VALUES ('%s', '%s', '%s', %d, '%s', '%s', %d, %d, %d)", fullName, password, login, clientType, address, dob, isVerified, isActive, isNhs );        
        Connection dbConnection;
        try {
             dbConnection = DriverManager.getConnection(url, info);
             int results = dbConnection.prepareCall(sql).executeUpdate();
             return true;
        } catch (SQLException ex) {
            Logger.getLogger(LoginContext.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
