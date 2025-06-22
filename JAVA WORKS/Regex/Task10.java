// Problem 10: Text Search and Highlighter
// Question: Create a text search and highlight tool that finds and highlights specific words or phrases in a text document using regular expressions.

// Sample Test Case:
// - Input Text: "This is a sample text. It contains sample data."
// - Search Term: "sample"
// - Output: "This is a <span class='highlight'>sample</span> text. It contains <span class='highlight'>sample</span> data."

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
     public static String highlightText(String text, String searchTerm) {
        String escapedSearchTerm = Pattern.quote(searchTerm);
        String regex = "\\b" + escapedSearchTerm + "\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll("<span class='highlight'>" + searchTerm + "</span>");
    }
    public static void main(String[] args) {
        String inputText = "This is a sample text. It contains sample data.";
        String searchTerm = "sample";
        String highlightedText = highlightText(inputText, searchTerm);
        System.out.println(highlightedText);
    }
}
