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
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jakubmol
 */
public class LoginContext {
    /*        String url = "jdbc:mysql://localhost:3306/test"; 
        Properties info = new Properties(); info.put("user", "root"); 
        info.put("password", "test"); 
        try {
            Connection dbConnection = DriverManager.getConnection(url, info);
       
        } catch (SQLException ex) {
            Logger.getLogger(LoginContext.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    
    
    public String getPassword(String username)
    {
        String url = "jdbc:derby://localhost:1527/SmartCare"; 
        Properties info = new Properties(); 
        info.put("user", "admin1"); 
        info.put("password", "1234"); 
        String sql = String.format("SELECT PASSWORD FROM ADMIN1.CLIENT WHERE USERNAME = '%s'", username);        
        Connection dbConnection;
        String password = "Not Found";
        try {
             dbConnection = DriverManager.getConnection(url, info);
             ResultSet results = dbConnection.prepareCall(sql).executeQuery();
             while(results.next())
             {
                 password = results.getString("PASSWORD");
             }
        } catch (SQLException ex) {
            Logger.getLogger(LoginContext.class.getName()).log(Level.SEVERE, null, ex);
        }
     return password;   
    }
}
