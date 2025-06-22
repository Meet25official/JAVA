//1. Library Management System: Overdue Book Exception

// Problem Statement:
//In a library management system, you need to handle cases where a book is returned after the due date. Create a custom exception `OverdueBookException` to manage this scenario.

class OverdueBookException extends Exception{
    public OverdueBookException(String messege){
        super(messege);
    }
}
class Library{
    String title;
    int date;

    public Library(String title , int date){
        this.title = title;
        this.date = date;
    }
    public void management() throws OverdueBookException{
        if (date >= 17) {
            throw new OverdueBookException("The returned date is pass away you are late pay fine for 200$");
        }
        else{
            System.out.println("Thank you please come every time.");
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Library obj = new Library("Ramayana", 23);
        try {
            obj.management();
        } catch (Exception e) {        
            e.printStackTrace();
        }
    } 
}