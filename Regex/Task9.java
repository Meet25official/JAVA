// Problem 9: Credit Card Number Masking
// Question: Implement a program to mask all but the last four digits of a credit card number using regex.

// Sample Test Case:
// - Input: "1234 5678 1234 5678"
// - Output: "5678"

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    private static final String CREDIT_CARD_REGEX = "\\b\\d{4} \\d{4} \\d{4} (\\d{4})\\b";

    public static String maskCreditCard(String cardNumber) {
        Pattern pattern = Pattern.compile(CREDIT_CARD_REGEX);
        Matcher matcher = pattern.matcher(cardNumber);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return "Invalid credit card number";
        }
    }
    public static void main(String[] args) {
        String cardNumber = "1234 5678 1234 5678";
        String lastFourDigits = maskCreditCard(cardNumber);
        System.out.println(lastFourDigits);  
    }
}
