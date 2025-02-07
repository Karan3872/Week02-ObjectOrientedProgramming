package com.tit.day05javainheritance.HierarchicalInheritance.BankAccountTypes;

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor for the CheckingAccount class
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call the superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    // Getter method for withdrawal limit
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }
}
