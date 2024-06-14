//4. Develop a program that takes a user's birthdate as input and calculates their current age.
import java.util.Scanner;
public class Task4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Birthyear: ");
		int birthdate = sc.nextInt();
		int age = 2024 - birthdate;
		System.out.println("print Age: "+ age);
		sc.close();
	}
}