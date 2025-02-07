package com.tit.day05javainheritance.HierarchicalInheritance.BankAccountTypes;

class SavingAccount extends BankAccount {
    private double interestRate;

    // Constructor for the SavingsAccount class
    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call the superclass constructor
        this.interestRate = interestRate;
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    // Getter method for interest rate
    public double getInterestRate() {
        return interestRate;
    }
}
