// 9. Library Book Class: Design a `LibraryBook` class with a constructor that includes the book's title, author, and a boolean indicating whether it's checked out.

class LibraryBook {
    private String title;
    private String author;
    private boolean isCheckedOut;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;  
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Book is already checked out.");
        }
    }

    public void returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already in the library.");
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Checked Out: " + (isCheckedOut ? "Yes" : "No"));
    }
}

public class Task9 {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Programming", "Meet");

        book.displayInfo();
        book.checkOut();
        book.displayInfo();
        book.returnBook();
        book.displayInfo();
    }
}
