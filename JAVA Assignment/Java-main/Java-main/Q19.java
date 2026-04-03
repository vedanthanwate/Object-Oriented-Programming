class Book {
    String title;
    String author;
    double price;

    // constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + 
                           ", Author: " + author + 
                           ", Price: " + price);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {

        // array of Book objects
        Book[] books = new Book[3];

        books[0] = new Book("Java Basics", "James", 500);
        books[1] = new Book("Python Guide", "Guido", 600);
        books[2] = new Book("C++ Handbook", "Bjarne", 700);

        // display all books
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}