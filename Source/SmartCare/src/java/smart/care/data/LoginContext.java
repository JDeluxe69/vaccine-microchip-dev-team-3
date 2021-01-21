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
public class LoginContext {    
    public ClientDto getClient(String username) throws Exception
    {
        String url = "jdbc:derby://localhost:1527/SmartCare"; 
        Properties info = new Properties(); 
        info.put("user", "admin1"); 
        info.put("password", "1234"); 
        String sql = String.format("SELECT * FROM APP.CLIENT WHERE USERNAME = '%s'", username);        
        Connection dbConnection;
        try {
             dbConnection = DriverManager.getConnection(url, info);
             ResultSet results = dbConnection.prepareCall(sql).executeQuery();
             ClientDto client = clientBuilder(results).get(0);
             return client;
        } catch (SQLException ex) {
            Logger.getLogger(LoginContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<ClientDto> getClients() throws Exception
    {
        String url = "jdbc:derby://localhost:1527/SmartCare"; 
        Properties info = new Properties(); 
        info.put("user", "admin1"); 
        info.put("password", "1234"); 
        String sql = String.format("SELECT * FROM APP.CLIENT WHERE IS_VERIFIED = 1 AND IS_ACTIVE =  1");        
        Connection dbConnection;
        try {
             dbConnection = DriverManager.getConnection(url, info);
             ResultSet results = dbConnection.prepareCall(sql).executeQuery();
             List<ClientDto> clients = clientBuilder(results);
             return clients;
        } catch (SQLException ex) {
            Logger.getLogger(LoginContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private List<ClientDto> clientBuilder(ResultSet results)
    {
        List<ClientDto> clients = new ArrayList<ClientDto>();
        try {
             while(results.next())
             {
                ClientDto client = new ClientDto();
                client.setId(results.getInt(ClientTableKeys.Id));
                client.setName(results.getString(ClientTableKeys.Name));
                client.setPassword(results.getString(ClientTableKeys.Password));
                client.setUsername(results.getString(ClientTableKeys.Username));
                client.setClientType(
                        ClientType.toClientType(results.getInt(ClientTableKeys.ClientType)));
                client.setDob(results.getDate(ClientTableKeys.Dob));
                client.setAddress(results.getString(ClientTableKeys.Address));
                client.setIsActive(toBoolean(results.getInt(ClientTableKeys.IsActive)));
                client.setIsVerified(toBoolean(results.getInt(ClientTableKeys.IsVerified)));   
                client.setIsNhs(toBoolean(results.getInt(ClientTableKeys.IsNhs)));
                clients.add(client);
             }
        } catch (SQLException ex) {
            Logger.getLogger(LoginContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clients;
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
