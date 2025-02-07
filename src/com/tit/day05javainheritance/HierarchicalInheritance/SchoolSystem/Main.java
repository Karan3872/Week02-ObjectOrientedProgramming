package com.tit.day05javainheritance.HierarchicalInheritance.SchoolSystem;

public class Main {

    // Main method: entry point of the application
    public static void main(String[] args) {
        // Create instances of Teacher, Student, and Staff
        Teacher teacher = new Teacher("Michell Johnson", 45, "Mathematics");
        Student student = new Student("Dwaine Smith", 42, "10th Grade");
        Staff staff = new Staff("Josh Brown", 26, "Administration");

        // Display roles and details of each person
        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        student.displayRole();
        student.displayDetails();
        System.out.println();

        staff.displayRole();
        staff.displayDetails();
    }
}