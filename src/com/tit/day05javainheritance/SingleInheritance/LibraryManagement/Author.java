package com.tit.day05javainheritance.SingleInheritance.LibraryManagement;

class Author extends Book {
    private String name;
    private String bio;

    // Constructor for the Author class
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call the superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overridden method to display book and author information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}