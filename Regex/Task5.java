// Problem 5: Date Format Conversion
// Question: Write a program that converts dates from one format to another (e.g., from "MM/DD/YYYY" to "YYYY-MM-DD") using regex.

// Sample Test Case:
// - Input: "12/31/2022"
// - Output: "2022-12-31"

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    private static final String DATE_REGEX = "(\\d{2})/(\\d{2})/(\\d{4})";

    public static String convertDateFormat(String date) {
        Pattern pattern = Pattern.compile(DATE_REGEX);
        Matcher matcher = pattern.matcher(date);

        if (matcher.matches()) {
            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);
            return year + "-" + month + "-" + day;
        } else {
            return "Invalid date format";
        }
    }
    public static void main(String[] args) {
        String date = "12/31/2022";

        String convertedDate = convertDateFormat(date);
        System.out.println(convertedDate);  
    }
}
