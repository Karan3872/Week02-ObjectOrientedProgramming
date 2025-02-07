package com.tit.day05javainheritance.assistproblems.VehicleAndTransportSystem;

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor for the Motorcycle class
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType); // Call the superclass constructor
        this.hasSidecar = hasSidecar;
    }

    // Overridden method to display motorcycle information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }

    // Getter for hasSidecar
    public boolean hasSidecar() {
        return hasSidecar;
    }
}