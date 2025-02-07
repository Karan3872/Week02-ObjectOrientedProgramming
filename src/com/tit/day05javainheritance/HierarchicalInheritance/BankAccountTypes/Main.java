package com.tit.day05javainheritance.HierarchicalInheritance.BankAccountTypes;

public class Main {

    // Main method: entry point of the application
    public static void main(String[] args) {
        // Create instances of different account types
        SavingAccount savingsAccount = new SavingAccount("SA12345", 5000.0, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA12345", 2000.0, 1000.0);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FDA12345", 10000.0, 12);

        // Display account types and details
        savingsAccount.displayAccountType();
        savingsAccount.displayAccountDetails();
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate() + "%");
        System.out.println();

        checkingAccount.displayAccountType();
        checkingAccount.displayAccountDetails();
        System.out.println("Withdrawal Limit: " + checkingAccount.getWithdrawalLimit());
        System.out.println();

        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayAccountDetails();
        System.out.println("Deposit Term: " + fixedDepositAccount.getDepositTerm() + " months");
    }
}