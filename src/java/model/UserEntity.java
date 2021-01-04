/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author jakubmol
 */
@Entity(name = "CLIENT")
public class UserEntity implements Serializable {
    
    private String name;
    private String password; 
    private long id;
    private String username;

    
    @Id
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    @Id
    @GeneratedValue
    @Column(name = "ID")
    public long getId() {
        return id;
    }
    

    
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
