package com.tit.day05javainheritance.HierarchicalInheritance.SchoolSystem;

class Staff extends Person {
    private String department;

    // Constructor for the Staff class
    public Staff(String name, int age, String department) {
        super(name, age); // Call the superclass constructor
        this.department = department;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    // Overridden method to display staff details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

    // Getter method for department
    public String getDepartment() {
        return department;
    }
}