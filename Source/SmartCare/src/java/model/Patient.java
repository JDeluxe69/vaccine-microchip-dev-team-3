/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Abdirahman Ali - 13013021
 */
public class Patient extends User {

    private int patientID;
    private Date dateOfBirth;
    private Address address;
//    private boolean insured;
    private String service;

    public Patient() {

    }

    public Patient(String username, int patientID, Date dateOfBirth, Address address, String service) {
        this.username = username;
        this.patientID = 1;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.service = service;
    }


    protected Patient(String username, String firstName,
            String surName, int patientID, Date dateOfBirth, Address address, boolean insured) {

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
            this.patientID = patientID;
            this.dateOfBirth = dateOfBirth;
            this.address = address;
        } else {
            System.out.println("Constructor with ID can only be called by the Database class");
        }

    }

    public int getPatientID() {
        return patientID;
    }

    public String getDateOfBirth() {
        return String.valueOf(dateOfBirth);
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    

    @Override
    public String toString() {
        return "Patient{" + "username=" + username + ", patientID=" + patientID + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", serviceType" + service + '}';
    }

}
