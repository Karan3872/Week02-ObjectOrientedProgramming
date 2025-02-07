package com.tit.javaencapsulationpolymorphismabstraction.EmployeeManagementSystem;

// Subclass representing a Part-Time Employee
public class PartTimeEmployee extends Employee {

    // Private fields for working hours and hourly rate
    private int workingHours;
    private double hourlyRate;

    // Constructor for the PartTimeEmployee class
    PartTimeEmployee(String employeeId, String name, double baseSalary, int workingHours, double hourlyRate) {
        super(employeeId, name, baseSalary); // Call the superclass constructor
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    // Overridden method to calculate the salary of a part-time employee
    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate; // Calculate salary based on working hours and hourly rate
    }

    // Getter method for working hours
    public int getWorkingHours() {
        return workingHours;
    }

    // Setter method for working hours
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    // Getter method for hourly rate
    public double getHourlyRate() {
        return hourlyRate;
    }

    // Setter method for hourly rate
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
