//2. Create a program that prompts the user to enter their age, and then determine if they are eligible for voting (age >= 18).

import java.util.Scanner;
public class Task2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the user :- ");
		int age1 = sc.nextInt();
		if(age1 >= 18){
			System.out.println("User Eligible for voting.");
		}
		else{
			System.out.println("User Not Eligible for voting.");
		}
		sc.close();
	}
}