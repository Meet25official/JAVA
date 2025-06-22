/* 5. User Authentication:
   Build a secure authentication system using hashed passwords in Java, where users' passwords are stored as hashes and compared during login verification.

     5. User Authentication:
     - Input: Username: "user123", Password: "Password@123"
     - Expected Output: Hashed password stored securely; successful login using the correct credentials.

 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the User name :- ");
        String un = sc.nextLine();
        System.out.println("Enter the Passward :- ");
        String pass = sc.nextLine();
        
        if (pass.contains("@")){
            if (pass.contains("")) {
                
            }
        }
        else{
            System.out.println("The Pass is Inavilid. Please enter the vailid passward.....");
        }
    }
}