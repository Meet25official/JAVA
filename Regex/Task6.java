// Problem 6: HTML Tag Removal
// Question: Create a tool to remove all HTML tags from a given string using regular expressions.

// Sample Test Case:
// - Input: "<p>This is a <b>sample</b> text.</p>"
// - Output: "This is a sample text."

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    private static final String HTML_TAG_REGEX = "<[^>]*>";

    public static String removeHtmlTags(String input) {
        Pattern pattern = Pattern.compile(HTML_TAG_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");
    }
    public static void main(String[] args) {
        String htmlString = "<p>This is a <b>sample</b> text.</p>";
        String result = removeHtmlTags(htmlString);
        System.out.println(result);  
    }    
}
