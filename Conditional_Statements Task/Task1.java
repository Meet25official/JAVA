//1. Write a Java program to get a number from the user and print whether it is positive or negative.

//Test Data
//Input number: 35
//Expected Output :
//Number is positive

import java.util.Scanner;

public class Task1{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Input Number: ");
		int num = s.nextInt();
		if(num > 0){
			System.out.println("Number is Positive.");
		}
		else if(num < 0){
			System.out.println("Number is Negative.");
		}
		else{
			System.out.println("Number is Zero.");
		}
	}
}