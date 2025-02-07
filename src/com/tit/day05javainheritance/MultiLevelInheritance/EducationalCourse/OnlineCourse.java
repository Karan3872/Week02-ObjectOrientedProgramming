package com.tit.day05javainheritance.MultiLevelInheritance.EducationalCourse;

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    // Constructor for the OnlineCourse class
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call the superclass constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overridden method to display online course information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }

    // Getter methods
    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }
}