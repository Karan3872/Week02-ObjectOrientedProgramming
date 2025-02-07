package com.tit.javaencapsulationpolymorphismabstraction.LibraryManagementSystem;

// Creating an interface Reservable with methods for reservation-related actions
interface Reservable {
    String reserveItem();
    boolean checkAvailability();
}