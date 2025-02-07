package com.tit.day05javainheritance.SingleInheritance.LibraryManagement;

class Book {
    private String title;
    private int publicationYear;

    // Constructor for the Book class
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book information (to be overridden by subclass)
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}