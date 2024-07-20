// Scenario 2: Configuration Settings
// In a configuration management system, define a class called "Configuration" with final variables for system settings like database URL, username, and password. These variables cannot be modified and represent fixed configuration values.

class Configuration {

    public static final String DATABASE_URL;
    public static final String USERNAME;
    public static final String PASSWORD;
    static {
        DATABASE_URL = "jdbc:mysql://localhost:19045/mydatabase";
        USERNAME = "admin";
        PASSWORD = "password123";
    }
}
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Database URL: " + Configuration.DATABASE_URL);
        System.out.println("Username: " + Configuration.USERNAME);
        System.out.println("Password: " + Configuration.PASSWORD);
    }
}
