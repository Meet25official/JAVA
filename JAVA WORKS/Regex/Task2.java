// Problem 2: Phone Number Formatting
// Question: Create a program to format phone numbers in a specific pattern using regex.

// Sample Test Case:
// - Input: "1234567890"
// - Output: "(123) 456-7890"

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static String formatPhoneNumber(String phoneNumber) {
        String regex = "(\\d{3})(\\d{3})(\\d{4})";
        String format = "($1) $2-$3";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        
        if (matcher.matches()) {
            return matcher.replaceAll(format);
        } else {
            return "Invalid phone number";
        }
    }

    public static void main(String[] args) {
        String phoneNumber = "1234567890";
        
        String formattedNumber = formatPhoneNumber(phoneNumber);
        System.out.println(formattedNumber);  
    }
}
