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
        System.out.println("\nDeposit completed successfully!");
    }

    public void withdrawal (double value) {
        if (value <= balance) {
            balance -= value;
            System.out.println("\nWithdrawal completed successfully!");
        } else {
            System.out.println("\nWithdrawal not allowed. Insufficient balance!");
        }
    }

    @Override
    public String toString() {
        return accHolderName + " | Account Number : " + accNumber + " | Current balance: " + balance;
    }

}
