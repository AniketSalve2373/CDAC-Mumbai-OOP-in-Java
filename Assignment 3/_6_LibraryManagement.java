import java.util.*;

class Book {
    int id;
    String title, author;
    boolean available = true;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void issue() {
        if (available) {
            available = false;
            System.out.println(title + " issued");
        } else {
            System.out.println(title + " not available");
        }
    }

    void returnBook() {
        available = true;
    }
}

public class _6_LibraryManagement {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();

        Book b1 = new Book(1, "Java", "James");
        Book b2 = new Book(2, "DBMS", "Korth");

        list.add(b1);
        list.add(b2);

        b1.issue();
        b1.issue();

        for (Book b : list) {
            System.out.println(b.title + " Available: " + b.available);
        }
    }
}