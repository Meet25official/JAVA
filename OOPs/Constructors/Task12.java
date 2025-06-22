//2. Book Class: Design a `Book` class with a constructor to store information about a book, including its title, author, and publication year.
class Book{
    private String title,author;
    private int publication_year;

    public Book(String title , String author , int publication_year){
        this.title = title;
        this.author = author;
        this.publication_year = publication_year;
    }

    void getDetails(){
        System.out.println("The title of the book is :- "+title);
        System.out.println("The author of the book is :- "+author);
        System.out.println("The publication year of the book is :- "+publication_year);
    }
};

public class Task12 {
    public static void main(String[] args) {
        Book obj = new Book("History of Himesh", "Himesh", 2024);
        obj.getDetails();
    }
}
