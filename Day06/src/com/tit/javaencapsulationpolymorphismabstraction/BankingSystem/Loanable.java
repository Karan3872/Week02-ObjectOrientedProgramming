package com.tit.javaencapsulationpolymorphismabstraction.BankingSystem;

// Creating an interface Loanable with methods for loan-related actions
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}