// Problem 3: Password Strength Checker
// Question: Develop a tool to check the strength of a password using regex to ensure it meets specific criteria (e.g., length, special characters, etc.).

// Sample Test Case:
// - Input: "P@ssw0rd123"
// - Output: Strong

import java.util.regex.Pattern;

public class Task3 {
    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])" + "(?=.*[A-Z])" + "(?=.*\\d)" + "(?=.*[@#$%^&+=])" + ".{8,}$";                   

    public static String checkPasswordStrength(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        
        if (pattern.matcher(password).matches()) {
            return "Strong";
        } else {
            return "Weak";
        }
    }
    public static void main(String[] args) {
        String password = "P@ssw0rd123";
        
        String strength = checkPasswordStrength(password);
        System.out.println(strength);  
    }
}
