import java.util.ArrayList;

// Class representing a Book
class Book {
    
    // Private fields for author and title
    private String author;
    private String title;
    
    // Constructor for the Book class
    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    // Method to display book details
    public void displayBooksDetails() {
        System.out.println("The author of the Book: " + this.author);
        System.out.println("The title of the Book: " + this.title);
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }
}

// Class representing a Library
class Library {
    
    // Private fields for library name and list of books
    private String libraryName;
    private ArrayList<Book> books;

    // Constructor for the Library class
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added " + book.getTitle() + " to " + libraryName);
    }
   
    // Method to display details of all books in the library
    public void displayBooks() {
        for (Book book : books) {
            book.displayBooksDetails();
        }
    }

    // Method to get the total number of books in the library
    public int getTotalBooks() {
        return books.size();
    }

    // Getter method for library name
    public String getLibraryName() {
        return libraryName;
    }
}

// Main class containing the main method
public class Problem1 {

    // Main method: entry point of the application
    public static void main(String[] args) {
        
        // Creating Book objects with author and title
        Book book1 = new Book("Harper Lee", "To Kill a Mockingbird");
        Book book2 = new Book("George Orwell", "1984");
        Book book3 = new Book("Jane Austen", "Pride and Prejudice");
        Book book4 = new Book("F. Scott Fitzgerald", "The Great Gatsby");
        Book book5 = new Book("Herman Melville", "Moby Dick");
        Book book6 = new Book("J.D. Salinger", "The Catcher in the Rye");
        Book book7 = new Book("Aldous Huxley", "Brave New World");
        Book book8 = new Book("Leo Tolstoy", "War and Peace");
       
        // Creating Library objects
        Library library1 = new Library("Galaxy library");
        Library library2 = new Library("Star library");

        // Adding books to libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library2.addBook(book5);
        library2.addBook(book6);
        library2.addBook(book7);
        library2.addBook(book8);

        // Displaying books in Galaxy library
        System.out.println(library1.getLibraryName() + ": ");
        library1.displayBooks();
        System.out.println("Total books in " + library1.getLibraryName() + ": " + library1.getTotalBooks());

        // Displaying books in Star library
        System.out.println(library2.getLibraryName() + ": ");
        library2.displayBooks();
        System.out.println("Total books in " + library2.getLibraryName() + ": " + library2.getTotalBooks());
    }
}
