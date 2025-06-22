//Scenario 1: Library Catalog System
//Design a library catalog system where a library has multiple books. The library class contains a list of book objects, representing an aggregation relationship.

import java.util.Scanner;

class Book{
    private String ISBN;
    private String title;
    private String author;
    private int year;

    public Book(){}
    public Book(String ISBN , String title , String author , int year){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    } 
    public void display(){
        System.out.println("ISBN   :- "+ISBN);
        System.out.println("Title  :- "+title);
        System.out.println("Author :- "+author);
        System.out.println("Year   :- "+year);
    }
}

class Library{
    Book books[];
    int count = 0;

    public Library(int capacity){
        books = new Book[capacity];
    }

    public void addBooks(String ISBN , String title , String author , int year){
        if(count < books.length){
            books[count++] = new Book(ISBN , title , author , year);
            System.out.println("Books added succesfull");
        }else{
            System.out.println("The capacity is full.");
        }
    }

    public void removeBooks(String isbn){
        for (int i = 0; i < count; i++) {
            if (books[i].getISBN().equals(isbn)){
                for(int j = i; j< count-1 ; j++){
                    books[j] = books[j+1];
                }
                count--;
                System.out.println("Book removed succecfully.");
                return;
            }
            else{
                System.out.println("The book is not available in this library.");
            }
        }
    }

    public void updateBooks(String isbn){
        for (int i = 0; i < count; i++) {
            if (books[i].getISBN().equals(isbn)){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1------------>ISBN");
                    System.out.println("2------------>title");
                    System.out.println("3------------>author");  
                    System.out.println("4------------>year"); 
                    System.out.println("0------------>exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1: System.out.println("Enter the new ISBN :- ");
                                sc.nextLine();
                                String is = sc.nextLine();
                                books[i].setTitle(is);
                                break;
                        case 2: System.out.println("Enter the new title :- ");
                                sc.nextLine();
                                String t = sc.nextLine();
                                books[i].setTitle(t);
                                break;
                        case 3: System.out.println("Enter the new author :- ");
                                sc.nextLine();
                                String a = sc.nextLine();
                                books[i].setTitle(a);
                                break;    
                        case 4: System.out.println("Enter the new year :- ");
                                sc.nextLine();
                                String y = sc.nextLine();
                                sc.close();
                                books[i].setTitle(y);
                                break;
                        case 0: break;            
                        default:System.out.println("Invailid Choice!!!");
                            break;
                    }
                } while (choice != 0);
                System.out.println("The book updated succesfully.");
                
                return;
            }
        }
    }

    public void displayAllBook(){
        for (int i = 0; i < count; i++) {
            books[i].display();
            System.out.println("------------------------------------------------------");
        }
    }

}

public class Task1 {
    public static void main(String[] args) {
            Library obj = new Library(10);
            obj.addBooks("1", "Title1", "Author1", 2011);
            obj.addBooks("2", "Title2", "Author2", 2012);
            obj.addBooks("3", "Title3", "Author3", 2013);
            obj.addBooks("4", "Title4", "Author4", 2014);
            obj.addBooks("5", "Title5", "Author5", 2015);

            obj.displayAllBook();

            obj.removeBooks("3");

            obj.displayAllBook();

            obj.updateBooks("5");

            obj.displayAllBook();
    }
}