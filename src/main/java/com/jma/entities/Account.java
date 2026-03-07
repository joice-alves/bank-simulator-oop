package com.jma.entities;

public class Account {
    int accNumber;
    private final AccHolder accHolderName;
    double balance;


    public Account(int accNumber, AccHolder accHolderName, double currentBalance) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = currentBalance;
    }

    public void deposit (double value) {
        balance += value;
    }

    public boolean withdrawal (double value) {
        if (value <= balance) {
            balance -= value;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return accHolderName + " | Account Number : " + accNumber + " | Current balance: " + balance;
    }

}
