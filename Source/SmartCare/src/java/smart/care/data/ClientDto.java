/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.care.data;

import java.sql.Date;
import smart.care.comm.ClientType;

/**
 *
 * @author jakubmol
 */
public class ClientDto {
    private int Id;
    private String Name;
    private String Password;
    private String Username;
    private ClientType ClientType;
    private String Address;
    private Date Dob;
    private boolean IsVerified;
    private boolean IsActive;
    private boolean IsNhs;

    public boolean isIsNhs() {
        return IsNhs;
    }

    public void setIsNhs(boolean IsNhs) {
        this.IsNhs = IsNhs;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public ClientType getClientType() {
        return ClientType;
    }

    public void setClientType(ClientType ClientType) {
        this.ClientType = ClientType;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date Dob) {
        this.Dob = Dob;
    }

    public boolean isIsVerified() {
        return IsVerified;
    }

    public void setIsVerified(boolean IsVerified) {
        this.IsVerified = IsVerified;
    }

    public boolean isIsActive() {
        return IsActive;
    }

    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }
    
}
