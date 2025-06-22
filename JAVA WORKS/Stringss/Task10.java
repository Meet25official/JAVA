// 10. Internationalization and Localization:
//     Create a Java program that manages multi-language support by enabling users to switch between languages, displaying content based on their selected language preference.

//     - Input: Select language as "French"
//       - Expected Output: Display content in French language as per the user's choice.

import java.util.Scanner;

public class Task10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select language (English/French): ");
        String language = scanner.nextLine().trim().toLowerCase();
        
        switch (language) {
            case "e":
                displayContent("english");
                break;
            case "f":
                displayContent("french");
                break;
            default:
                System.out.println("Language not supported.");
                break;
        }
        
        scanner.close();
    }
    
    private static void displayContent(String language) {
        String greeting;
        String farewell;
        
        if ("french".equals(language)) {
            greeting = "Bonjour, bienvenue dans notre application!";
            farewell = "Au revoir, à bientôt!";
        } else {
            greeting = "Hello, welcome to our application!";
            farewell = "Goodbye, see you soon!";
        }
        
        System.out.println(greeting);
        System.out.println(farewell);
    }
}
