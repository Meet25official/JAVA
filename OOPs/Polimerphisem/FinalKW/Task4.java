//Scenario 2: Database Connectivity
//In a database connectivity framework, define a class called "DatabaseConnection" with a final variable for the database connection URL. This variable cannot be modified and represents the fixed database connection URL.

class DatabaseConnection{
     final String URL = "https://www.google.com";
     final String password = "himesh0704";

    void displayDetails(){
        System.out.println("The URL of this connection is :- "+URL);
        System.out.println("The passward of this connection is :- "+password);
    }
}

public class Task4 {
    public static void main(String[] args) {
        DatabaseConnection obj = new DatabaseConnection();
        // obj.URL = "www.yahoo.com";
        // obj.password = "Himehs2010";
        obj.displayDetails();
    }
}
