//7. Static Block and Static Methods in Single Inheritance:
//- Problem Statement: Create a single inheritance setup with classes 'Library' and 'Book'. The 'Library' class should have a static block to initialize a static variable 'libraryName', and a static method 'showLibraryInfo()'. The 'Book' class should have attributes 'title' and 'author', and a method 'showBookInfo()'. Demonstrate the use of static blocks, static methods, and the 'super' keyword.

class Library{
    private static String libraryName;
    
    public Library(String li){
        libraryName = li;
    }

    public static void showLibraryInfo(){
        System.out.println("The name of this library :- "+libraryName);
    }
}

class Book extends Library{
    private String title;
    private String author;

    public Book(String libraryName , String title , String author){
        super(libraryName);
        this.title = title;
        this.author = author;
    }

    public void showBookInfo(){
        Library.showLibraryInfo();
        System.out.println("The title of this book is :- "+title);
        System.out.println("The author of this book is :- "+author);
    }
}

public class Task7 {
    public static void main(String[] args) {
        Book obj = new Book("Garg Library", "History of Himesh", "Himesh");
        obj.showBookInfo();  
    }  
}