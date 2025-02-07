package com.tit.day05javainheritance.SingleInheritance.SmartHomeDevices;

class Thermostat extends Device {
    private int temperatureSetting;

    // Constructor for the Thermostat class
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Call the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overridden method to display thermostat status
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }

    // Getter method for temperature setting
    public int getTemperatureSetting() {
        return temperatureSetting;
    }
}
