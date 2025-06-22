// Problem 4: URL Parser
// Question: Implement a URL parser that extracts different components (e.g., protocol, domain, path) from a given URL using regular expressions.

// Sample Test Case:
// - Input: "https://www.example.com/path/to/resource"
// - Output:
//   - Protocol: "https"
//   - Domain: "www.example.com"
//   - Path: "/path/to/resource"

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    private static final String URL_REGEX = "^(https?)://" + "([^/]+)" + "(/.*)?$";     

    public static void parseURL(String url) {
        Pattern pattern = Pattern.compile(URL_REGEX);
        Matcher matcher = pattern.matcher(url);
        
        if (matcher.matches()) {
            String protocol = matcher.group(1);
            String domain = matcher.group(2);
            String path = matcher.group(3) != null ? matcher.group(3) : "/";

            System.out.println("Protocol: " + protocol);
            System.out.println("Domain: " + domain);
            System.out.println("Path: " + path);
        } else {
            System.out.println("Invalid URL");
        }
    }
    public static void main(String[] args) {
        String url = "https://www.example.com/path/to/resource";
        
        parseURL(url);
    }
}
