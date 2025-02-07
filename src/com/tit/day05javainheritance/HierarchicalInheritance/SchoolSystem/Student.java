package com.tit.day05javainheritance.HierarchicalInheritance.SchoolSystem;

class Student extends Person {
    private String grade;

    // Constructor for the Student class
    public Student(String name, int age, String grade) {
        super(name, age); // Call the superclass constructor
        this.grade = grade;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Student");
    }

    // Overridden method to display student details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }

    // Getter method for grade
    public String getGrade() {
        return grade;
    }
}