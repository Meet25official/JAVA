// Problem 7: License Plate Recognition
// Question: Develop a program to recognize and validate license plate numbers using regex based on a predefined format.

// Sample Test Case:
// - Input: "AB123CD"
// - Output: Valid

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    private static final String LICENSE_PLATE_REGEX = "^[A-Z]{2}\\d{3}[A-Z]{2}$";

    public static String validateLicensePlate(String plate) {
        Pattern pattern = Pattern.compile(LICENSE_PLATE_REGEX);
        Matcher matcher = pattern.matcher(plate);
        
        if (matcher.matches()) {
            return "Valid";
        } else {
            return "Invalid";
        }
    }
    public static void main(String[] args) {
        String plate = "AB123CD";
        String result = validateLicensePlate(plate);
        System.out.println(result);  
    }
}
