/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jakubmol
 */
public class LoginContext {    
    public String getPassword(String username)
    {
        String url = "jdbc:derby://localhost:1527/SmartCareDB"; 
        Properties info = new Properties(); 
        info.put("uname", "admin"); 
        info.put("passwd", "admin123"); 
        String sql = String.format("select * from USERS");        
        Connection dbConnection;
        String passwd = "Not Found";
        try {
             dbConnection = DriverManager.getConnection(url, info);
             ResultSet results = dbConnection.prepareCall(sql).executeQuery();
             while(results.next())
             {
                 passwd = results.getString("PASSWORD");
             }
        } catch (SQLException ex) {
            Logger.getLogger(LoginContext.class.getName()).log(Level.SEVERE, null, ex);
        }
     return passwd;   
    }
}
