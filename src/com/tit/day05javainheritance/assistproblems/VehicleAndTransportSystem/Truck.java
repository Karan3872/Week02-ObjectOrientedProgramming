package com.tit.day05javainheritance.assistproblems.VehicleAndTransportSystem;

class Truck extends Vehicle {
    private int cargoCapacity;

    // Constructor for the Truck class
    public Truck(int maxSpeed, String fuelType, int cargoCapacity) {
        super(maxSpeed, fuelType); // Call the superclass constructor
        this.cargoCapacity = cargoCapacity;
    }

    // Overridden method to display truck information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
    }

    // Getter for cargo capacity
    public int getCargoCapacity() {
        return cargoCapacity;
    }
}
