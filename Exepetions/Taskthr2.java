//2. Input Validation in a User Registration System: Write a Java program for a user registration system where the 'throw' keyword is employed to manage input validation errors. For instance, use 'throw' to handle cases like invalid email formats or missing required fields during user registration.

import java.util.regex.Pattern;

class InvalidEmail extends Exception{
    public InvalidEmail(String messege){
        super(messege);
    }
}

class Registration{
    private String name;
    private String email;

    public Registration(String name , String email){
        this.name = name;
        this.email = email;
    }

    public void validation() throws InvalidEmail{
        if (Pattern.matches("[\\w.]*['@']{1}\\w*['.com']{4}", email)){
            System.out.println("The email is vailid");
            System.out.println("The name of this user is :- "+name);
            System.out.println("The email of this user is :- "+email);
        }
        else{
            throw new InvalidEmail("The Email is not valid for over requirment.");
        }
    }
}

public class Taskthr2 {
    public static void main(String[] args) {
        Registration obj = new Registration("Mohak Sir", "mohak_royal@gmail.com");
        try{
            obj.validation();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}