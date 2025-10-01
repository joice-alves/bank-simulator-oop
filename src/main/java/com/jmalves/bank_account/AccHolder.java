package com.jmalves.bank_account;

public class AccHolder {

    private String name;
    private String idNumber;

    public AccHolder (String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Account Holder: " + name + " | ID Number: " + idNumber;
    }
    
}
