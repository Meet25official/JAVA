// Problem 1: Email Validation
// Question: Write a Java program to validate email addresses using regular expressions.

// Sample Test Case:
// - Input: "user@example.com"
// - Output: Valid

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    private static final String EMAIL_PATTERN = 
        "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + 
        "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String email = "meetsarvaiya05@gmail.com";
        
        if (isValidEmail(email)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
