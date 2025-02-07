package com.tit.day05javainheritance.HierarchicalInheritance.BankAccountTypes;

class FixedDepositAccount extends BankAccount {
    private int depositTerm; // Deposit term in months

    // Constructor for the FixedDepositAccount class
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance); // Call the superclass constructor
        this.depositTerm = depositTerm;
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    // Getter method for deposit term
    public int getDepositTerm() {
        return depositTerm;
    }
}