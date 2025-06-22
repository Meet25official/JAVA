//4. Develop a program that takes a user's birthdate as input and calculates their current age.

import java.util.Scanner;
public class Task4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date of Birthday of the user :- ");
		int date = sc.nextInt();
		System.out.println("Enter the Month of Birthday of the user :- ");
		String month = sc.next();
		System.out.println("Enter the Year of Birthday of the user :- ");
		int year = sc.nextInt();
		int current_age = 2024 - year;
		System.out.println("Your birthdate is:-"+date+" , month is :- "+month+" and year is :- "+year);
		System.out.println("The Current age of the user is :- "+current_age);
		sc.close();
	}
}