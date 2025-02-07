package com.tit.javaencapsulationpolymorphismabstraction.FoodDeliverySystem;

// Creating an interface Discountable with methods for discount-related actions
interface Discountable {
    void applyDiscount(double percentage);
    boolean isDiscountAvailable();
    void setDiscountAvailable(boolean available);
    void getDiscountDetails();
}
