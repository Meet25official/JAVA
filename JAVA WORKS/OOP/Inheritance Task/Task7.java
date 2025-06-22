// 7. Static Block and Static Methods in Single Inheritance:
//    - Problem Statement: Create a single inheritance setup with classes 'Library' and 'Book'. The 'Library' class should have a static block to initialize a static variable 'libraryName', and a static method 'showLibraryInfo()'. The 'Book' class should have attributes 'title' and 'author', and a method 'showBookInfo()'. Demonstrate the use of static blocks, static methods, and the 'super' keyword.

class Library {
    static String libraryName;

    static {
        libraryName = "My Library";
    }

    static void showLibraryInfo() {
        System.out.println("Library Name: " + libraryName);
    }
}

class Book extends Library {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        super.showLibraryInfo();
    }
}

public class Task7 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe");
        book1.showBookInfo();

        Library.showLibraryInfo();
    }
}
