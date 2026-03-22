package Book_Class;

import java.util.ArrayList;

// Book class
class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

// Library class
class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Remove a book by ISBN
    public void removeBook(String isbn) {
        boolean found = false;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.remove(i);
                System.out.println("Book removed successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("Library Books:");
        for (Book book : books) {
            book.displayBook();
        }
    }
}

// Main class
public class Book_class {
    public static void main(String[] args) {
        Library library = new Library();

        // Creating book objects
        Book b1 = new Book("Java Basics", "John Doe", "111");
        Book b2 = new Book("OOP Concepts", "Jane Smith", "222");
        Book b3 = new Book("Data Structures", "Mark Lee", "333");

        // Adding books
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Display books
        library.displayBooks();

        // Remove a book
        library.removeBook("222");

        // Display again
        library.displayBooks();
    }
}