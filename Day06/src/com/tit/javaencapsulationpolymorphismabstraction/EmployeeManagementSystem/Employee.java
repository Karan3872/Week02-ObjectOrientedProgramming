package com.tit.javaencapsulationpolymorphismabstraction.EmployeeManagementSystem;

// Abstract class representing an Employee
abstract class Employee {

    // Private fields for employee ID, name, and base salary
    private String employeeId;
    private String name;
    private double baseSalary;

    // Constructor for the Employee class
    Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method to calculate salary (to be implemented by subclasses)
    public abstract double calculateSalary();

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + employeeId);
        // System.out.println("Employee salary: " + baseSalary);
    }

    // Getter method for employee ID
    public String getEmployeeId() {
        return employeeId;
    }

    // Setter method for employee ID
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for base salary
    public double getBaseSalary() {
        return baseSalary;
    }

    // Setter method for base salary
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}
