/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author bupal
 */
class Consultation extends DBObject{
    

    private Patient patient;
    private Staff doctor;
    private Staff nurse;
    private Date consultationDate;
    private int consultationID;

    public Consultation() {

    }

    protected Consultation(Patient patient, Staff doctor, Staff nurse, Date consultationDate, int consulationID) {
        boolean isDatabase = false;

        try {
            if (Class.forName(Thread.currentThread().getStackTrace()[2].getClassName()) == Database.class) {
                isDatabase = true;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }

        if (isDatabase) {
            this.patient = patient;
            this.doctor = doctor;
            this.nurse = nurse;
            this.consultationDate = consultationDate;
            this.consultationID = consulationID;
        } else {
            System.out.println("Constructor with ID can only be called by the Database class");
        }
    }

    public Consultation(Patient patient, Staff doctor, Staff nurse, Date consultationDate) {
        this.patient = patient;
        this.doctor = doctor;
        this.nurse = nurse;
        this.consultationDate = consultationDate;
        this.consultationID = -1;
    }

    public int getConsultationID() {
        return consultationID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Staff getDoctor() {
        return doctor;
    }

    public void setDoctor(Staff doctor) {
        this.doctor = doctor;
    }

    public Staff getNurse() {
        return nurse;
    }

    public void setNurse(Staff nurse) {
        this.nurse = nurse;
    }

    public Date getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }


    @Override
    public String toString() {
        return "Consultation{" + "patient=" + patient + ", doctor=" + doctor + ", nurse=" + nurse + ", consultationDate=" + consultationDate + ", consulationID=" + consultationID + '}';
    }

}
