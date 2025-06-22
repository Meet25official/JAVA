// Scenario 2: Configuration Settings
// In a configuration management system, define a class called "Configuration" with final variables for system settings like database URL, username, and password. These variables cannot be modified and represent fixed configuration values.

final class Configuration {
    public static final String DATABASE_URL = "C:\\Users\\Meet\\Desktop\\JAVA";
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "My@123";
}
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Database URL: " + Configuration.DATABASE_URL);
        System.out.println("Username: " + Configuration.USERNAME);
        System.out.println("Password: " + Configuration.PASSWORD);
    }
}
