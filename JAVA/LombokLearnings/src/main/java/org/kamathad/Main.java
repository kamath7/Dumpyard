package org.kamathad;

public class Main {
    public static void main(String[] args) {
        //Testing if this actually works

        BankAccount bankAccount = new BankAccount("100202","Cristiano",100000.0D);

        System.out.println(bankAccount);
        bankAccount.deposit(1000);
        bankAccount.withdraw(1000);

        System.out.println(bankAccount.getBalance());

        //Make sure you have Enable Annotation processing on. I spent sometime debugging it
        BankAccountLombok bankAccountLombok = new BankAccountLombok("10202","Cristiano",1223.00D);
        bankAccountLombok.deposit(100);
        bankAccountLombok.withdraw(200);
        System.out.println(bankAccountLombok);

        BankAccountBuilderLombok bankAccountBuilderLombok = BankAccountBuilderLombok.builder()
                                                                                    .accountNumber("10092")
                                                                                    .accountName("Cristiano")
                                                                                    .balance(100000.00d)
                                                                                    .build();

        System.out.println(bankAccountBuilderLombok);
        bankAccountBuilderLombok.deposit(100);
        bankAccountBuilderLombok.withdraw(100);
        System.out.println(bankAccountBuilderLombok);
    }
}