/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.care.comm;

import javax.validation.ValidationException;

/**
 *
 * @author jakubmol
 */
public enum ClientType {
    DOCTOR(0), PATIENT(1), NURSE(2), ADMIN(3);
    
    private int code;

    ClientType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    
    public static ClientType toClientType(int code)
    {
        switch(code){
            case 0:
                return ClientType.DOCTOR;
            case 1:
                return ClientType.PATIENT;
            case 2:
                return ClientType.NURSE;
            case 3:
                return ClientType.ADMIN;
            default:
                throw new ValidationException();
        }
    }
}
