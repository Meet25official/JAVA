//1. Data Validation:
//   Design a Java program that validates and sanitizes user-provided email addresses, ensuring they adhere to standard email format rules (e.g., presence of '@' and '.' symbols, proper domain format).
/*
1. Data Validation:
   - Input: "user@example.com"
     - Expected Output: Valid email address
   - Input: "invalid-email"
     - Expected Output: Invalid email address
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the any semple email :- ");
      String pass = sc.nextLine();

      System.out.println("The String is :- "+pass);
      if(pass.endsWith(".com")){
        if (pass.contains("@")){
          if(pass.contains("mail")){
            System.out.println("Vailid Email...");
          }else{
            System.out.println("Invailid Email...");
          }
        }else{
          System.out.println("Invailid Email...");
        }
      }
      else{
        System.out.println("Invailid Email...");
      }
      sc.close();
    }
}