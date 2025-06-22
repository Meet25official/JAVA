//Problem 1: Email Validation
// Question: Write a Java program to validate email addresses using regular expressions.

// Sample Test Case:
// - Input: "user@example.com"
// - Output: Valid

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email :- ");
        String email = sc.nextLine();
        System.out.println("The email is :- "+email);
        boolean p = Pattern.matches("[\\w.]*['@']{1}\\w*['.com']{4}", email);
        System.out.println("The email address is :- "+p);   
        // himeshpatel0704@gmail.com
        sc.close();
    }
}