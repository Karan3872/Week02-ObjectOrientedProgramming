package com.tit.day05javainheritance.MultiLevelInheritance.OnlineOrderManagement;


import java.util.Date;
class ShippedOrder extends Order {
    private String trackingNumber;

    // Constructor for the ShippedOrder class
    public ShippedOrder(String orderId, Date orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call the superclass constructor
        this.trackingNumber = trackingNumber;
    }

    // Method to display shipped order details
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }

    // Overridden method to get the order status
    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    // Getter method for tracking number
    public String getTrackingNumber() {
        return trackingNumber;
    }
}