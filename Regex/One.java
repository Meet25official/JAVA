import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class One {
    public static void main(String[] args) {
      // 1st way
      // Pattern p = Pattern.compile(".a");    //. represents single character
      // Matcher m = p.matcher("ja");
      // boolean b = m.matches();
      // System.out.println(b);
      
      // 2nd way
      // boolean b = Pattern.compile(".s").matcher("as").matches();
      // System.out.println(b);
      
      // 3rd way
      // boolean b = Pattern.matches(".s", "as");
      // System.out.println(b);
      
      // System.out.println(Pattern.matches("..i...", "Hii---"));
      // System.out.println(Pattern.matches("[^amn]*", "hiesh"));
      
      // System.out.println(Pattern.matches("\\d*", "123456789098"));
      // System.out.println(Pattern.matches("\\D*", "dfuisjghdiufgh$%^##%^#"));
      
      // System.out.println(Pattern.matches("[a-zA-Z0-9]{1,5}", "himesh"));
      // System.out.println(Pattern.matches("['+']{1}[91]{2}[6-9]{1}[0-9]{9}", "+917359062677"));
    }
}

/*
Tasks:




Problem 3: Password Strength Checker
Question: Develop a tool to check the strength of a password using regex to ensure it meets specific criteria (e.g., length, special characters, etc.).

Sample Test Case:
- Input: "P@ssw0rd123"
- Output: Strong

Problem 4: URL Parser
Question: Implement a URL parser that extracts different components (e.g., protocol, domain, path) from a given URL using regular expressions.

Sample Test Case:
- Input: "https://www.example.com/path/to/resource"
- Output:
  - Protocol: "https"
  - Domain: "www.example.com"
  - Path: "/path/to/resource"

Problem 5: Date Format Conversion
Question: Write a program that converts dates from one format to another (e.g., from "MM/DD/YYYY" to "YYYY-MM-DD") using regex.

Sample Test Case:
- Input: "12/31/2022"
- Output: "2022-12-31"

Problem 6: HTML Tag Removal
Question: Create a tool to remove all HTML tags from a given string using regular expressions.

Sample Test Case:
- Input: "<p>This is a <b>sample</b> text.</p>"
- Output: "This is a sample text."

Problem 8: IP Address Validation
Question: Write a Java program to validate IPv4 and IPv6 addresses using regular expressions.

Sample Test Cases:
- Input: "192.168.1.1"
- Output: Valid

- Input: "2001:0db8:85a3:0000:0000:8a2e:0370:7334"
- Output: Valid

Problem 9: Credit Card Number Masking
Question: Implement a program to mask all but the last four digits of a credit card number using regex.

Sample Test Case:
- Input: "1234 5678 1234 5678"
- Output: "5678"

Problem 10: Text Search and Highlighter
Question: Create a text search and highlight tool that finds and highlights specific words or phrases in a text document using regular expressions.

Sample Test Case:
- Input Text: "This is a sample text. It contains sample data."
- Search Term: "sample"
- Output: "This is a <span class='highlight'>sample</span> text. It contains <span class='highlight'>sample</span> data."
*/