package com.tit.day05javainheritance.HybridInheritance.VehicleManagementSystem;

class Vehicle {
    // Declaring protected attributes for the Vehicle class
    protected int maxSpeed;
    protected String model;

    // Constructor to initialize Vehicle objects with provided values
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.printf("Model: %s, Max Speed: %d km/h%n", model, maxSpeed);
    }
}
