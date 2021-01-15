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
public class Staff extends Employee {

    private int staffID;



    public Staff(String username, String firstName, String surName, boolean isFullTime) {
        this.username = username;
        this.fullTime = isFullTime;
        this.staffID = -1;
    }

    protected Staff(String username, String firstName, String surName, boolean isFullTime, int doctorID) {
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
            this.staffID = staffID;

        } else {
            System.out.println("Constructor with ID can only be called by the Database class");
        }

    }

    public int getStaffID() {
        return staffID;
    }

    @Override
    public String toString() {
        return "Staff{" + "username=" + username + ", isFullTime=" + fullTime + ", doctorID=" + staffID + '}';
    }

}