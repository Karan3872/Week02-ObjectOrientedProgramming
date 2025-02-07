package com.tit.javaencapsulationpolymorphismabstraction.EmployeeManagementSystem;

// Class representing the IT Department, implementing the Department interface
public class ITDepartment implements Department {

    // Private field for the department name
    private String departmentName;

    // Constructor for the ITDepartment class
    ITDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    // Method to assign an employee to the IT department
    @Override
    public void assignDepartment(Employee employee) {
        System.out.println(employee.getName() + " assigned to " + departmentName);
    }

    // Method to get the details of the IT department
    @Override
    public String getDepartmentDetails() {
        return departmentName;
    }
}
