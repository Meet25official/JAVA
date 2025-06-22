// 2. Book Class: Design a `Book` class with a constructor to store information about a book, including its title, author, and publication year.

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}
public class Task2 {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "John Doe", 2020);
        
        book1.displayInfo();
        book1.setPublicationYear(2022);
        
        System.out.println("Updated publication year:");
        
        book1.displayInfo();
    }
}
