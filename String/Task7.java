/*  7. URL Manipulation:
   Design a URL parser in Java that takes a URL string as input and separates it into its constituent parts like protocol, domain, path, and query parameters.

     7. URL Manipulation:
   - Input URL: "https://www.example.com/path/to/resource?param1=value1&param2=value2"
     - Expected Output: Separated components - protocol: "https", domain: "www.example.com", path: "/path/to/resource", query parameters: {"param1": "value1", "param2": "value2"}

 */

public class Task7 {
    public static void main(String[] args) {
        String URL = "https://www.example.com/path/to/resource?param1=value1&param2=value2";
        String protocol = URL.substring(0,5);
        String domain = URL.substring(8, 23);
        String path = URL.substring(24, 0);
        System.out.println(domain);
    }
}
