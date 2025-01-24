/*
* Problem 5: University Management System
Description: Model a university system with Student, Professor, and Course classes. Students enroll in courses, and professors teach courses. Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
Goal: Use association and aggregation to create a university system that emphasizes relationships and interactions among students, professors, and courses.

* */

import java.util.ArrayList;

// Creating a Course class to represent individual courses in the university
class Course {
    // Declaring attributes for the Course class
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    // Constructor to initialize the Course object with provided course name
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>(); // Initializing the ArrayList of students
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.enrollCourse(this); // Maintain bidirectional association
        }
    }

    // Method to display course details including the professor and enrolled students
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + professor.getName());
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("  - " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Creating a Student class to represent students in the university
class Student {
    // Declaring attributes for the Student class
    private String name;
    private int id;
    private ArrayList<Course> courses;

    // Constructor to initialize the Student object with provided name and id
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>(); // Initializing the ArrayList of courses
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    // Getter method for the student name
    public String getName() {
        return name;
    }

    // Method to display all courses a student is enrolled in
    public void displayCourses() {
        System.out.println("Student: " + name + " (ID: " + id + ") is enrolled in:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName());
        }
    }
}

// Creating a Professor class to represent professors in the university
class Professor {
    // Declaring attributes for the Professor class
    private String name;
    private String department;
    private ArrayList<Course> courses;

    // Constructor to initialize the Professor object with provided name and department
    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
        this.courses = new ArrayList<>(); // Initializing the ArrayList of courses
    }

    // Getter method for the professor name
    public String getName() {
        return name;
    }

    // Method to assign a course to the professor
    public void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this); // Maintain bidirectional association
        }
    }

    // Method to display all courses a professor teaches
    public void displayCourses() {
        System.out.println("Professor: " + name + " (Department: " + department + ") teaches:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName());
        }
    }
}

// Creating class Problem8 to demonstrate the functionalities of the University Management System
class Problem8
{
    public static void main(String[] args) {
        // Creating Professor objects
        Professor profSmith = new Professor("Dr. Smith", "Computer Science");
        Professor profJohnson = new Professor("Dr. Johnson", "Mathematics");

        // Creating Student objects
        Student alice = new Student("Alice", 101);
        Student bob = new Student("Bob", 102);

        // Creating Course objects
        Course cs101 = new Course("Introduction to Computer Science");
        Course math101 = new Course("Calculus I");

        // Assigning Professors to Courses
        profSmith.assignCourse(cs101);
        profJohnson.assignCourse(math101);

        // Enrolling Students in Courses
        cs101.enrollStudent(alice);
        math101.enrollStudent(alice);
        cs101.enrollStudent(bob);

        // Displaying the courses each student is enrolled in
        alice.displayCourses();
        bob.displayCourses();

        // Displaying the courses each professor teaches
        profSmith.displayCourses();
        profJohnson.displayCourses();

        // Displaying detailed information about each course
        cs101.displayCourseDetails();
        math101.displayCourseDetails();
    }
}