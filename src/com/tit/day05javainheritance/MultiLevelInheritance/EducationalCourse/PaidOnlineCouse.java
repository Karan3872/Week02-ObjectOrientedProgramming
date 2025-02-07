package com.tit.day05javainheritance.MultiLevelInheritance.EducationalCourse;

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    // Constructor for the PaidOnlineCourse class
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call the superclass constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Overridden method to display paid online course information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }

    // Getter methods
    public double getFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }
}