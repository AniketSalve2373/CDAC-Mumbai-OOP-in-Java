class Book {
    int id;
    String name;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Library {
    Book books[] = new Book[2];

    void add() {
        books[0] = new Book(1, "Java");
        books[1] = new Book(2, "DSA");
    }

    void display() {
        for (Book b : books)
            System.out.println(b.id + " " + b.name);
    }
}

class _20_library_system {
    public static void main(String[] args) {
        Library l = new Library();
        l.add();
        l.display();
    }
}