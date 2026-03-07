package com.jma.application;

import com.jma.entities.AccHolder;
import com.jma.entities.Account;

public class BankSimulator {

    private final Account account;

    public BankSimulator (String name, String idNumber, int accNumber, double currentBalance) {
        AccHolder holder = new AccHolder(name, idNumber);
        this.account = new Account(accNumber, holder, currentBalance);
        System.out.println("Account current balance is $" + currentBalance + ".\n" + account);

    }

    public Account showAccountDeposit(double value) {
        account.deposit(value);
        System.out.println("\nDeposit of $" + value + " successful!");
        return account;
    }

    public Account showAccountWithdrawal(double value) {
        boolean success = account.withdrawal(value);

        if (success) {
            System.out.println("\nWithdrawal of $" + value + " successful!");
        } else {
            System.err.println("\nALERT: Transaction failed for " + value + ". Insufficient funds!");
        }
        return account;
    }

    public static void main(String[] args) {
        BankSimulator myBankSimulator = new BankSimulator("Maria Jose", "1789", 67342, 0);

        System.out.println(myBankSimulator.showAccountDeposit(700.5));
        System.out.println(myBankSimulator.showAccountWithdrawal(300.76));
    }
}