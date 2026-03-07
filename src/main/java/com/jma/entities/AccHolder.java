package com.jma.entities;

public class AccHolder {

    private final String name;
    private final String idNumber;

    public AccHolder (String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Account Holder: " + name + " | ID Number: " + idNumber;
    }
    
}
