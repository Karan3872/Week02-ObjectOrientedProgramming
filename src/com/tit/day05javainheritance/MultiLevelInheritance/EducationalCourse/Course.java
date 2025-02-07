package com.tit.day05javainheritance.MultiLevelInheritance.EducationalCourse;

class Course {
    private String courseName;
    private int duration; // Duration in hours

    // Constructor for the Course class
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course information
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }

    // Getter methods
    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }
}