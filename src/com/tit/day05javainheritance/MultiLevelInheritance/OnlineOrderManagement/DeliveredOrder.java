package com.tit.day05javainheritance.MultiLevelInheritance.OnlineOrderManagement;


import java.util.Date;
class DeliveredOrder extends ShippedOrder {
    private Date deliveryDate;

    // Constructor for the DeliveredOrder class
    public DeliveredOrder(String orderId, Date orderDate, String trackingNumber, Date deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call the superclass constructor
        this.deliveryDate = deliveryDate;
    }

    // Method to display delivered order details
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }

    // Overridden method to get the order status
    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    // Getter method for delivery date
    public Date getDeliveryDate() {
        return deliveryDate;
    }
}