//42. Write a Java program to input and display your password.
//Expected Output

//Input your Password:                                                    
//Your password was: abc@123

import java.util.Scanner;
public class Task42{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input your Password: ");
        String p = s.nextLine();
        System.out.println("Your password was: " + p);
    }
}
