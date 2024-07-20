// Scenario 1: Library Catalog System
// Design a library catalog system where a library has multiple books. The library class contains a list of book objects, representing an aggregation relationship.


class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){  
        return author;
    }
}

class Library {
    Book[] books;
    int bookCount;

    public Library(int cap) {
        bookCount = 0;
        books = new Book[cap]; 
    }

    public void addBook(Book book1){
        books[bookCount] = book1;
        bookCount++;
    }

    public void display(){
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title: " + books[i].getTitle() + ", Author: " + books[i].getAuthor());
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Library lib = new Library(5);
        lib.addBook(new Book("abc", "xyz"));

        System.out.println("-----Book Info-----");
        lib.display();
    }
}

