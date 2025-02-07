package com.tit.javaencapsulationpolymorphismabstraction.RideHailingApplication;

// Creating a class Bike to represent specific bike cases inheriting from Vehicle (Subclass)
class Bike extends Vehicle implements GPS {
    // Constructor to initialize Bike objects with provided values
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Implementing the calculateFare() method for bikes
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    // Implementing the getCurrentLocation() method for bikes
    @Override
    public String getCurrentLocation() {
        return "Bike current location is GPS Coordinates: 9.9716° N, 69.5946° W";
    }

    // Implementing the updateLocation() method for bikes
    @Override
    public void updateLocation(String location) {
        System.out.println("Bike location updated to: " + location);
    }
}