package com.tit.day05javainheritance.MultiLevelInheritance.OnlineOrderManagement;

import  java.util.Date;
public class Main {

    // Main method: entry point of the application
    public static void main(String[] args) {
        // Create instances of Order, ShippedOrder, and DeliveredOrder
        Order order = new Order("ORD001", new Date());
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", new Date(), "TRK123");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", new Date(), "TRK456", new Date());

        // Display order details and status
        System.out.println("Order Details:");
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println();

        System.out.println("Shipped Order Details:");
        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());
        System.out.println();

        System.out.println("Delivered Order Details:");
        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}