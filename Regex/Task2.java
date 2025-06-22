//Problem 2: Phone Number Formatting
// Question: Create a program to format phone numbers in a specific pattern using regex.

// Sample Test Case:
// - Input: "1234567890"
// - Output: "(123) 456-7890"

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phone Number :- ");
        String ph = sc.nextLine();
        System.out.println("The phone number is :- "+ph);
        boolean p = Pattern.matches("[(]{1}[\\d]{3}[)][\\s]{1}[\\d]{3}[-]{1}[\\d]{4}", ph);
        System.out.println("The phone number is :- "+p);   
        sc.close();
    }
}
