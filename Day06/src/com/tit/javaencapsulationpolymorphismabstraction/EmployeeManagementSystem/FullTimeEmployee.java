package com.tit.javaencapsulationpolymorphismabstraction.EmployeeManagementSystem;

// Subclass representing a Full-Time Employee
public class FullTimeEmployee extends Employee {

    // Constructor for the FullTimeEmployee class
    FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary); // Call the superclass constructor
    }

    // Overridden method to calculate the salary of a full-time employee
    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Return the base salary
    }
}

