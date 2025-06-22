//1. Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;
public class Con1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number :- ");
		int a = sc.nextInt();
		if(a > 0){
			System.out.println("The number is Positive.");
		}
		else if(a < 0){
			System.out.println("The number is Negative.");
		}
		else{
			System.out.println("The number is Zero.");
		}
		sc.close();
	}
}