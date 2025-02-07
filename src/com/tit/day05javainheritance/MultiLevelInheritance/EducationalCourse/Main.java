package com.tit.day05javainheritance.MultiLevelInheritance.EducationalCourse;

public class Main {

    // Main method: entry point of the application
    public static void main(String[] args) {
        // Create instances of Course, OnlineCourse, and PaidOnlineCourse
        Course course = new Course("Java Programming", 40);
        OnlineCourse onlineCourse = new OnlineCourse("Web Development", 30, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Data Science", 50, "Coursera", true, 299.99, 20);

        // Display information of each course
        System.out.println("Course Details:");
        course.displayInfo();
        System.out.println();

        System.out.println("Online Course Details:");
        onlineCourse.displayInfo();
        System.out.println();

        System.out.println("Paid Online Course Details:");
        paidOnlineCourse.displayInfo();
    }
}