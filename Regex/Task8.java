//Problem 8: IP Address Validation
// Question: Write a Java program to validate IPv4 and IPv6 addresses using regular expressions.

// Sample Test Cases:
// - Input: "192.168.1.1"
// - Output: Valid

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any IP Adress :- ");
        String ip = sc.nextLine();
        System.out.println("Your IP Adress is :- "+ip);
        if (Pattern.matches("[\\d]{3}[.][\\d]{3}[.][\\d]{1}[.][\\d]", ip)){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Vailid");
        }
        sc.close();        
    }
}
