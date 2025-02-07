package com.tit.day05javainheritance.HierarchicalInheritance.BankAccountTypes;

class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor for the BankAccount class
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}