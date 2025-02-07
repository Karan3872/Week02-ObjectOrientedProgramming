package com.tit.javaencapsulationpolymorphismabstraction.EmployeeManagementSystem;
// Main class for the Employee Management System
public class EmployeeManagementSystem {

    // Main method: entry point of the application
    public static void main(String[] args) {

        // Creating instances of FullTimeEmployee and PartTimeEmployee
        Employee fullTimeEmployee = new FullTimeEmployee("IT101", "Chris Lynn", 25600);
        Employee partTimeEmployee = new PartTimeEmployee("IT102", "Marcus Stoinis", 23800, 12, 980);

        // Creating an instance of ITDepartment
        ITDepartment itDepartment = new ITDepartment("IT Department");

        // Assigning employees to the IT department
        itDepartment.assignDepartment(fullTimeEmployee);
        itDepartment.assignDepartment(partTimeEmployee);

        // Displaying employee details
        System.out.println("Employee Details:");

        // Calling the employeeDetails method for each employee
        employeeDetails(fullTimeEmployee);
        employeeDetails(partTimeEmployee);
    }

    // Method to display employee details and calculate salary
    public static void employeeDetails(Employee employee) {
        // Display employee details
        employee.displayDetails();

        // Calculate and display the salary paid
        System.out.println("Salary Paid: " + employee.calculateSalary());
        System.out.println();
    }
}
