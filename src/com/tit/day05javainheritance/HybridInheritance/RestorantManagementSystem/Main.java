package com.tit.day05javainheritance.HybridInheritance.RestorantManagementSystem;

public class Main {

    public static void main(String[] args) {

        Chef chef1 = new Chef("Dwaine Smith", 101);
        Chef chef2 = new Chef("Mitchell Johnson", 103);
        Waiter waiter1 = new Waiter("Ross Tailor", 102);
        Waiter waiter2 = new Waiter("Josh Phillipes", 104);

        // Displaying details and performing duties for each Chef
        chef1.displayDetails();
        chef1.performDuties();
        System.out.println();

        chef2.displayDetails();
        chef2.performDuties();
        System.out.println();

        // Displaying details and performing duties for each Waiter
        waiter1.displayDetails();
        waiter1.performDuties();
        System.out.println();

        waiter2.displayDetails();
        waiter2.performDuties();

    }

}
