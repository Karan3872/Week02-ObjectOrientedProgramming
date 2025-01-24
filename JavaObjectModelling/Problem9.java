/*
Sample Problem 1: School Results Application
Class Diagram
The class diagram represents the structure of a school results application where students have subjects, and their scores are calculated for grades.
Diagram Description:
Classes: Student, Subject, GradeCalculator
Relationships:
A Student has multiple Subject entries (Aggregation).
GradeCalculator computes the results for a Student.



Object Diagram
An object diagram provides a snapshot of the Student and their Subject objects at a particular point.
Example:
Student: John
Subjects: Maths, Science
Marks: 90, 85


Sequence Diagram
The sequence diagram shows how objects interact to calculate grades.
Scenario: A student requests their grade based on marks in subjects.
Actors:
Student
GradeCalculator
 */

 import java.util.ArrayList;

 // Creating a Subject class to represent individual subjects for students
 class Subject {
     private String name;
     private int marks;
 
     // Constructor to initialize the Subject object with provided name and marks
     public Subject(String name, int marks) {
         this.name = name;
         this.marks = marks;
     }
 
     // Getter method for the subject name
     public String getName() {
         return name;
     }
 
     // Getter method for the subject marks
     public int getMarks() {
         return marks;
     }
 
     @Override
     public String toString() {
         return name + ": " + marks;
     }
 }
 
 // Creating a Student class to represent students in the school
 class Student {
     private String name;
     private int id;
     private ArrayList<Subject> subjects;
 
     // Constructor to initialize the Student object with provided name and id
     public Student(String name, int id) {
         this.name = name;
         this.id = id;
         this.subjects = new ArrayList<>(); // Initializing the ArrayList of subjects
     }
 
     // Method to add a subject to the student
     public void addSubject(Subject subject) {
         subjects.add(subject);
     }
 
     // Getter method for the student name
     public String getName() {
         return name;
     }
 
     // Getter method for the student id
     public int getId() {
         return id;
     }
 
     // Getter method for the subjects
     public ArrayList<Subject> getSubjects() {
         return subjects;
     }
 
     // Method to display student details and subjects
     public void displayStudentDetails() {
         System.out.println("Student: " + name + " (ID: " + id + ")");
         System.out.println("Subjects:");
         for (Subject subject : subjects) {
             System.out.println("  - " + subject);
         }
     }
 }
 
 // Creating a GradeCalculator class to compute grades for students
 class GradeCalculator {
     // Method to calculate the grade for a student based on their subject marks
     public String calculateGrade(Student student) {
         ArrayList<Subject> subjects = student.getSubjects();
         if (subjects.isEmpty()) {
             return "No subjects enrolled.";
         }
 
         int totalMarks = 0;
         for (Subject subject : subjects) {
             totalMarks += subject.getMarks();
         }
 
         double average = totalMarks / subjects.size();
         if (average >= 90) {
             return "A";
         } else if (average >= 80) {
             return "B";
         } else if (average >= 70) {
             return "C";
         } else if (average >= 60) {
             return "D";
         } else {
             return "F";
         }
     }
 }
 
 // Creating class Problem9 to demonstrate the functionality of the school results application
  class Problem9 {
     public static void main(String[] args) {
         // Creating Student objects
         Student john = new Student("John", 1);
         Student jane = new Student("Jane", 2);
 
         // Adding subjects to students
         john.addSubject(new Subject("Maths", 90));
         john.addSubject(new Subject("Science", 85));
 
         jane.addSubject(new Subject("Maths", 75));
         jane.addSubject(new Subject("Science", 80));
 
         // Displaying student details
         john.displayStudentDetails();
         jane.displayStudentDetails();
 
         // Calculating and displaying grades for students
         GradeCalculator gradeCalculator = new GradeCalculator();
         System.out.println("Grade for John: " + gradeCalculator.calculateGrade(john));
         System.out.println("Grade for Jane: " + gradeCalculator.calculateGrade(jane));
     }
 }