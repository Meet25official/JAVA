// Scenario 2: Database Connectivity
// In a database connectivity framework, define a class called "DatabaseConnection" with a final variable for the database connection URL. This variable cannot be modified and represents the fixed database connection URL.

class DatabaseConnection {
    private final String connectionUrl;
    
    public DatabaseConnection(String url) {
        this.connectionUrl = url;
    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void connect() {
        System.out.println("Connecting to database with URL: " + connectionUrl);
    }
}
public class Task4 {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection("jdbc:mysql://localhost:3306/mydatabase");
        dbConnection.connect();
        System.out.println("Database URL: " + dbConnection.getConnectionUrl());
    }
}
