import java.util.ArrayList;

// Class representing a bank account
class Account {

    // Private fields for account number and balance
    private String AccountNumber;
    private double balance;

    // Constructor for the Account class
    public Account(String AccountNumber, double balance) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    // Getter method for account number
    public String getAccountNumber() {
        return AccountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit an amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount: " + amount + "  New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw an amount from the account
    public void withdrawl(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal amount: " + amount + " New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Class representing a customer
class Customer {
    
    // Private fields for customer name and list of accounts
    private String CustomerName;
    private ArrayList<Account> accounts;

    // Constructor for the Customer class
    public Customer(String CustomerName) {
        this.CustomerName = CustomerName;
        accounts = new ArrayList<>();
    }

    // Getter method for customer name
    public String getCustomerName() {
        return CustomerName;
    }

    // Method to add an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber() + " to customer: " + CustomerName);
    }

    // Method to view balance of all accounts of the customer
    public void viewBalance() {
        System.out.println(CustomerName + " has the following accounts:");
        for (Account account : accounts) {
            account.displayAccountDetails();
        }
    }
}

// Class representing a bank
class Bank {
    
    // Private fields for bank name and list of customers
    private String Bankname;
    private ArrayList<Customer> customers;

    // Constructor for the Bank class
    public Bank(String Bankname) {
        this.Bankname = Bankname;
        customers = new ArrayList<>();
    }

    // Getter method for bank name
    public String getBankName() {
        return Bankname;
    }

    // Method to open an account for a customer
    public void OpenAccount(Customer customer, Account account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
            System.out.println("Customer added: " + customer.getCustomerName() + " to bank: " + Bankname);
        }
    }

    // Method to display all customers of the bank
    public void displayAllCustomers() {
        System.out.println(Bankname + " has the following customers:");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getCustomerName());
            customer.viewBalance();
        }
    }
}

// Main class containing the main method
public class Problem2 {
    
    // Main method: entry point of the application
    public static void main(String[] args) {
        
        // Creating a Bank object
        Bank bank = new Bank("Business Bank");

        // Creating Customer objects
        Customer customer1 = new Customer("Dwaine Johnson");
        Customer customer2 = new Customer("Steve Smith");

        // Creating Account objects with account number and balance
        Account account1 = new Account("09876", 2000);
        Account account2 = new Account("12345", 3000);
        Account account3 = new Account("13579", 4000);

        // Opening accounts for customers in the bank
        bank.OpenAccount(customer1, account1);
        bank.OpenAccount(customer1, account2);
        bank.OpenAccount(customer2, account3);

        // Displaying all customers of the bank
        System.out.println(bank.getBankName() + " : ");
        bank.displayAllCustomers();
    }
}
