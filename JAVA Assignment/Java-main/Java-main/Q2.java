import java.util.ArrayList;

// Book Class
class Book {
    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        this.title  = title;
        this.author = author;
        this.ISBN   = ISBN;
    }

    public String toString() {
        return "Title: " + title + " | Author: " + author + " | ISBN: " + ISBN;
    }
}

// Library Class
class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add a book
    void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.title);
    }

    // Remove a book by ISBN
    void removeBook(String ISBN) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).ISBN.equals(ISBN)) {
                System.out.println("Removed: " + books.get(i).title);
                books.remove(i);
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }

    // Display all books
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("\n--- Available Books ---");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("-----------------------");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        // Create Book objects
        Book b1 = new Book("The Great Gatsby",    "F. Scott Fitzgerald", "ISBN001");
        Book b2 = new Book("To Kill a Mockingbird","Harper Lee",          "ISBN002");
        Book b3 = new Book("1984",                 "George Orwell",       "ISBN003");

        // Add books
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Display all books
        library.displayBooks();

        // Remove a book by ISBN
        library.removeBook("ISBN002");

        // Display after removal
        library.displayBooks();

        // Try removing a non-existent book
        library.removeBook("ISBN999");
    }
}
