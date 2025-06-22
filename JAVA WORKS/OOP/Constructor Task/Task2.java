// 2. Overloading Constructors:
//    Design a 'Book' class with fields for 'title', 'author', and 'price'. Implement multiple constructors: one default, one that takes only 'title' and 'author', and another that takes all three fields. Write a method to display book details.

class Book {
    private String title, author;
    private double price;
    
    public Book() {
        title = author = null;
        price = 0;
    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void getBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class Task2 {
    public static void main(String[] args) {
        Book b[] = new Book[3];

        b[0] = new Book("absdsdv", "dcsdcesdv", 200);
        b[0].getBookDetails();
    }
}
