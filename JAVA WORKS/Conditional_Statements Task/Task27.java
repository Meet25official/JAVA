//27. Write a Java program that reads an integer and check whether it is negative, zero, or positive.

//Test Data
//Input a number: 7
//Expected Output :

//Number is positive

import java.util.Scanner;

public class Task27{
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