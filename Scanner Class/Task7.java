// 7. Write a Java program that reads a user's favorite color and displays it back to them in a sentence.
import java.util.Scanner;
public class Task7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Color: ");
		String color = sc.next();
		System.out.println("User Favorite Color is " + color);
		sc.close();
	}
}
