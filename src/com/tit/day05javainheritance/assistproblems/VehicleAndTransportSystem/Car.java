package com.tit.day05javainheritance.assistproblems.VehicleAndTransportSystem;

class Car extends Vehicle {
    private int seatCapacity;

    // Constructor for the Car class
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Call the superclass constructor
        this.seatCapacity = seatCapacity;
    }

    // Overridden method to display car information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }

    // Getter for seat capacity
    public int getSeatCapacity() {
        return seatCapacity;
    }
}
