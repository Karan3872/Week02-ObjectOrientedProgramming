package com.tit.day05javainheritance.SingleInheritance.SmartHomeDevices;

public class Main {

    // Main method: entry point of the application
    public static void main(String[] args) {
        // Create an instance of Thermostat
        Thermostat thermostat = new Thermostat("ThermoNo1", "Active", 15);

        // Display the status of the thermostat
        thermostat.displayStatus();
    }
}