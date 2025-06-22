//2. Overloading Constructors:
// Design a 'Book' class with fields for 'title', 'author', and 'price'. Implement multiple constructors: one default, one that takes only 'title' and 'author', and another that takes all three fields. Write a method to display book details.

class Book{
    private String title,author;
    private double price;

    public Book(){
        title = "xyz";
        author = "Temp";
        price = 100;
    }

    public Book(String title , String author , double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void getDetails(){
        System.out.println("The title of the book is :- "+title);
        System.out.println("The author of the book is :- "+author);
        System.out.println("The price of the book is :- "+price);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Book obj1 = new Book();
        Book obj2 = new Book("Succes of Himesh","Himesh",20000);
        System.out.println("The details of store by defalt constructer");
        obj1.getDetails();
        System.out.println("The details of store by parameterlized constructer");
        obj2.getDetails();
    }
}
