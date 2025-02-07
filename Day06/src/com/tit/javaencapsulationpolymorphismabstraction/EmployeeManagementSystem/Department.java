package com.tit.javaencapsulationpolymorphismabstraction.EmployeeManagementSystem;

// Interface representing a Department
public interface Department {

    // Method to assign an employee to a department
    public void assignDepartment(Employee employee);

    // Method to get the details of the department
    public String getDepartmentDetails();

}
