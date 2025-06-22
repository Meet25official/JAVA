//30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal,
// "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

//Test Data
//Input first number: 2564
//Input second number: 3526
//Input third number: 2456
//Expected Output :

//All numbers are different

import java.util.Scanner;
public class Task30{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Input first number: ");
		double num1 = s.nextDouble();
		System.out.println("Input second number: ");
		double num2 = s.nextDouble();
		System.out.println("Input third number: ");
		double num3 = s.nextDouble();
		if(num1 == num2 && num1 == num3 && num2 == num3){
			System.out.println("All numbers are equal.");
		}
		else{
			System.out.println("All numbers are different.");
		}
	}
}