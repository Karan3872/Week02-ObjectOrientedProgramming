package com.tit.day05javainheritance.HierarchicalInheritance.SchoolSystem;

class Teacher extends Person {
    private String subject;

    // Constructor for the Teacher class
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the superclass constructor
        this.subject = subject;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    // Overridden method to display teacher details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }

    // Getter method for subject
    public String getSubject() {
        return subject;
    }
}
