package com.tit.day05javainheritance.SingleInheritance.SmartHomeDevices;

class Device {
    private String deviceId;
    private String status;

    // Constructor for the Device class
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status (to be overridden by subclass)
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }

    // Getter methods
    public String getDeviceId() {
        return deviceId;
    }

    public String getStatus(){
    return status;
    }
}