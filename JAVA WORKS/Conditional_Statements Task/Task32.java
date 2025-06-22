//32. Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal places.

//Test Data
//Input first floating­point number: 1235
//Input second floating­point number: 2534
//Expected Output :

//These numbers are different.

import java.util.Scanner;
public class Task32{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Input first number: ");
		double num1 = s.nextDouble();
		System.out.println("Input second number: ");
		double num2 = s.nextDouble();

		if(num1 == num2){
			System.out.println("These numbers are equal.");
		}
		else{
			System.out.println("These numbers are different.");
		}
	}
}