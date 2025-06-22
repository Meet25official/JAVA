//Problem 7: License Plate Recognition
// Question: Develop a program to recognize and validate license plate numbers using regex based on a predefined format.

// Sample Test Case:
// - Input: "AB123CD"
// - Output: Valid

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the any input :- ");
        String in = sc.nextLine();
        System.out.println("Your output is :- "+in);
        if ( Pattern.matches("[[A-Z]]{2}[\\d]{3}[[A-Z]]{2}", in)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
        sc.close();
    }
}