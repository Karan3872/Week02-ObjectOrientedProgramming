/*
Sample Problem 2: Grocery Store Bill Generation Application
Class Diagram
The class diagram models the system where a customer buys products, and the bill is generated.
Diagram Description:
Classes: Customer, Product, BillGenerator
Relationships:
A Customer can purchase multiple Product items (Composition).
BillGenerator computes the total for the Customer.



Object Diagram
An object diagram shows the details of a Customer and the Product objects they have purchased.
Example:
Customer: Alice
Products:
Apples (2 kg at $3 per kg)
Milk (1 liter at $2 per liter)


Sequence Diagram
The sequence diagram shows the process of bill generation for a customer.
Scenario: A customer checks out at the grocery store, and the total bill is generated.
Actors:
Customer
BillGenerator
→ Draw the Sequence Diagram

*/
import java.util.ArrayList;


// Creating a Product class to represent individual products in the grocery store
class Product {
    private String name;
    private double pricePerUnit;
    private double quantity;

    // Constructor to initialize the Product object with provided name, price per unit, and quantity
    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Getter method for the product name
    public String getName() {
        return name;
    }

    // Getter method for the product price per unit
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    // Getter method for the product quantity
    public double getQuantity() {
        return quantity;
    }

    // Method to calculate the total price for the product
    public double calculateTotalPrice() {
        return pricePerUnit * quantity;
    }

    @Override
    public String toString() {
        return name + " (" + quantity + " units at $" + pricePerUnit + " per unit)";
    }
}

// Creating a Customer class to represent customers in the grocery store
class Customer {
    private String name;
    private ArrayList<Product> products;

    // Constructor to initialize the Customer object with provided name
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>(); // Initializing the ArrayList of products
    }

    // Method to add a product to the customer's list of purchased products
    public void addProduct(Product product) {
        products.add(product);
    }

    // Getter method for the customer name
    public String getName() {
        return name;
    }

    // Getter method for the products
    public ArrayList<Product> getProducts() {
        return products;
    }

    // Method to display customer details and purchased products
    public void displayCustomerDetails() {
        System.out.println("Customer: " + name);
        System.out.println("Purchased Products:");
        for (Product product : products) {
            System.out.println("  - " + product);
        }
    }
}

// Creating a BillGenerator class to compute the total bill for a customer
class BillGenerator {
    // Method to calculate the total bill for a customer based on their purchased products
    public double calculateTotal(Customer customer) {
        ArrayList<Product> products = customer.getProducts();
        double total = 0;
        for (Product product : products) {
            total += product.calculateTotalPrice();
        }
        return total;
    }
}

// Creating class Problem10 to demonstrate the functionality of the grocery store bill generation application
class Problem10 {
    public static void main(String[] args) {
        // Creating Product objects
        Product apples = new Product("Apples", 3.0, 2.0); // 2 kg at $3 per kg
        Product milk = new Product("Milk", 2.0, 1.0); // 1 liter at $2 per liter

        // Creating a Customer object
        Customer customer = new Customer("Alice");

        // Adding products to the customer's list of purchased products
        customer.addProduct(apples);
        customer.addProduct(milk);

        // Displaying customer details and purchased products
        customer.displayCustomerDetails();

        // Creating a BillGenerator object
        BillGenerator billGenerator = new BillGenerator();

        // Calculating and displaying the total bill for the customer
        double totalBill = billGenerator.calculateTotal(customer);
        System.out.println("Total Bill: $" + totalBill);
    }
}