package org.kamathad;

public class BankAccount {

    private String accountNumber;

    private String accountHolderName;

    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amountToBeAdded){
        this.balance += amountToBeAdded;
        System.out.println("Balance successfuly updated. Current balance "+this.balance);
    }

    public void withdraw(double withdrawalAmount){
        if(balance - withdrawalAmount < 0) {
            System.out.println("You do not have sufficient balance to make a withdrawal");
        }
        this.balance -= withdrawalAmount;
        System.out.println("Balance updated. Current balance "+this.balance);
    }

}
