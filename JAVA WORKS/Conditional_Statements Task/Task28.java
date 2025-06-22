//28. Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

//Test Data
//Input a number: -2534
//Expected Output :

//Negative

import java.util.Scanner;

public class Task28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double n = sc.nextDouble();

		if(n > 0) {
			if(n < 1) {
				System.out.println("Positive Small");
			} else if(n > 1000000) {
				System.out.println("Positive Large");
			} else {
				System.out.println("Positive ");
			}
		} else if(n < 0) {
			if(Math.abs(n) < 1) {
				System.out.println("Negative Small: " + Math.abs(n));
			} else if(Math.abs(n) > 1000000) {
				System.out.println("Negative Large: " + Math.abs(n));
			} else {
				System.out.println("Negative ");
			}
		} else {
			System.out.println("Zero");
		}
	}
}