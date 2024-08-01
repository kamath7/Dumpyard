package org.kamathad;


import lombok.*;

@Getter
@AllArgsConstructor
@Builder
@ToString
public class BankAccountBuilderLombok {

    @NonNull private String accountNumber;
    @NonNull private String accountName;
    private double balance;

    public void deposit(double amountToBeAdded) {
        this.balance += amountToBeAdded;
        System.out.println("Balance successfuly updated. Current balance " + this.balance);
    }

    public void withdraw(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("You do not have sufficient balance to make a withdrawal");
        }
        this.balance -= withdrawalAmount;
        System.out.println("Balance updated. Current balance " + this.balance);
    }
}
