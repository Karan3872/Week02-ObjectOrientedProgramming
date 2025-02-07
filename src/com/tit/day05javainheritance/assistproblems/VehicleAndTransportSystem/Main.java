package com.tit.day05javainheritance.assistproblems.VehicleAndTransportSystem;

public class Main {

    // Main method: entry point of the application
    public static void main(String[] args) {
        // Create instances of Car, Truck, and Motorcycle
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 5000);
        Vehicle motorcycle = new Motorcycle(150, "Petrol", true);

        // Store the objects in an array of Vehicle type
        Vehicle[] vehicles = {car, truck, motorcycle};

        // Call the displayInfo() method on each object
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}