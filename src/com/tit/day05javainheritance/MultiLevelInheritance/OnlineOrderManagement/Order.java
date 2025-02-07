package com.tit.day05javainheritance.MultiLevelInheritance.OnlineOrderManagement;

import java.util.Date;
class Order {
    private String orderId;
    private Date orderDate;

    // Constructor for the Order class
    public Order(String orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

    // Method to get the order status
    public String getOrderStatus() {
        return "Order Placed";
    }

    // Getter methods
    public String getOrderId() {
        return orderId;
    }

    public Date getOrderDate(){
    return  orderDate;
    }
}