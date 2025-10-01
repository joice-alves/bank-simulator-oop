package com.jmalves.bank_account;

public class Main {
    public static void main(String[] args) {
        AccHolder accHolder1 = new AccHolder("Maria Jose", "58702");
        AccHolder accHolder2 = new AccHolder("Joao Silva", "54321");

        Account account1 = new Account(0001, accHolder1, 0);
        Account account2 = new Account(0002, accHolder2, 0);
        System.out.println(account1);
        System.out.println(account2);

        account1.deposit(2300.5);
        account2.deposit(1748.5);
        System.out.println("\nUpdated balance after deposit:");
        System.out.println(account1);
        System.out.println(account2);

        account1.withdrawal(1890.0);
        account2.withdrawal(300.7);
        System.out.println("\nUpdated balance after withdrawal:");
        System.out.println(account1);
        System.out.println(account2);
    }
}