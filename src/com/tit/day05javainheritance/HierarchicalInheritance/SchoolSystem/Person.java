package com.tit.day05javainheritance.HierarchicalInheritance.SchoolSystem;

class Person {
    private String name;
    private int age;

    // Constructor for the Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}