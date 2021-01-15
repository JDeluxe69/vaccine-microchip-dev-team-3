/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bupal
 */
public class Admin extends Employee {
    
    private int adminID;

    public Admin() {
    }
    
        public Admin(String username, boolean isFullTime) {
        this.username = username;
        this.fullTime = isFullTime;
        this.adminID = -1;
    }
    
           protected Admin(String username, String firstName, String surName, boolean isFullTime, int adminID) {
        boolean isDatabase = false;

        try {
            if (Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()) == Database.class) {
                isDatabase = true;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

        if (isDatabase) {
            this.username = username;
            this.fullTime = isFullTime;
            this.adminID = adminID;
        } else {
            System.out.println("Constructor with ID can only be called by the Database class");
        }
    }

    public int getAdminID() {
        return adminID;
    }

    @Override
    public String toString() {
        return "Admin{" + "username=" + username + ", isFullTime=" + fullTime + ", adminID=" + adminID + '}';
    }
}
