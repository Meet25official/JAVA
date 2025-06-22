//Scenario 2: Configuration Settings
//In a configuration management system, define a class called "Configuration" with final variables for system settings like database URL, username, and password. These variables cannot be modified and represent fixed configuration values.

class Configuration{
    final String URL = "http://www.google.com";
    final String username = "HimeshPatel";
    final double password = 1234;
    
    void display(){
        System.out.println("The URL is :- "+URL);
        System.out.println("The username is :- "+username);
        System.out.println("The password is :- "+password);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Configuration obj = new Configuration();
        // obj.URL = "sdfg";
        // obj.username = "qwert";
        // obj.password = 543;
        obj.display();
    }  
}
