package com.tit.day05javainheritance.assistproblems.VehicleAndTransportSystem;

class Vehicle {
    private int maxSpeed;
    private String fuelType;

    // Constructor for the Vehicle class
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information (to be overridden by subclasses)
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }

    // Getter methods
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }
}