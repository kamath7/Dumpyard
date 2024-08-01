package org.kamathad;

public class Main {
    public static void main(String[] args) {
        //Testing if this actually works

        BankAccount bankAccount = new BankAccount("100202","Cristiano",100000.0D);

        System.out.println(bankAccount.toString());
        bankAccount.deposit(1000);
        bankAccount.withdraw(1000);

        System.out.println(bankAccount.getBalance());
    }
}