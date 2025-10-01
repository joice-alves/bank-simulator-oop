package com.jmalves.bank_account;

public class Account {
    int accNumber;
    private AccHolder accHolderName;
    double balance;


    public Account(int accNumber, AccHolder accHolderName, double currentBalance) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = currentBalance;
    }

    public void deposit (double value) {
        balance += value;
    }

    public void withdrawal (double value) {
        if (value <= balance) {
            balance -= value;
        } else {
            System.out.println("Withdrawal not allowed. Insufficient balance!");
        }
    }

    @Override
    public String toString() {
        return accHolderName + " | Account Number : " + accNumber + " | Current balance: " + balance;
    }

}
