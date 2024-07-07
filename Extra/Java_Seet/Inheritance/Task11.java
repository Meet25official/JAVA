// Scenario 11: Library Management System
// Design a library management system where you have classes like "Library," "Book," and "Member." Implement methods for borrowing, returning, and searching for books.


class Book {
    String title;
    String author;
    boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; 
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Book \"" + title + "\" by " + author + " has been borrowed.");
        } else {
            System.out.println("Book \"" + title + "\" is currently not available.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book \"" + title + "\" has been returned.");
        } else {
            System.out.println("Book \"" + title + "\" is already available.");
        }
    }
}

class Member {
    String name;
    int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void borrowBook(Book[] books, String title) {
        Book book = findBook(books, title);
        if (book != null) {
            book.borrow();
        } else {
            System.out.println("Book \"" + title + "\" not found in the library.");
        }
    }

    public void returnBook(Book[] books, String title) {
        Book book = findBook(books, title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book \"" + title + "\" not found in the library.");
        }
    }

    private Book findBook(Book[] books, String title) {
        for (Book book : books) {
            if (book != null && book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

class Library {
    Book[] books;
    int maxBooks;
    int currentSize;

    public Library(int maxBooks) {
        this.maxBooks = maxBooks;
        this.books = new Book[maxBooks];
        this.currentSize = 0;
    }

    public void addBook(Book book) {
        if (currentSize < maxBooks) {
            books[currentSize++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        System.out.println("Books available in the library:");
        for (int i = 0; i < currentSize; i++) {
            Book book = books[i];
            if (book != null) {
                System.out.println("Title: " + book.title + ", Author: " + book.author + ", Available: " + book.available);
            }
        }
    }
}

public class Task11 {
    public static void main(String[] args) {
        Library library = new Library(5);

        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Python Basics", "Jane Smith");
        Book book3 = new Book("Data Structures", "Alice Johnson");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        Member member1 = new Member("Alice", 1);
        Member member2 = new Member("Bob", 2);

        member1.borrowBook(library.books, "Java Programming");
        member2.borrowBook(library.books, "Python Basics");
        library.displayBooks();

        member2.returnBook(library.books, "Python Basics");
        library.displayBooks();
    }
}
