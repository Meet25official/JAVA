//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;
public class Basic12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:- ");
		double n1 = sc.nextDouble();
		System.out.println("Enter the second number:- ");
		double n2 = sc.nextDouble();
		System.out.println("Enter the third number:- ");
		double n3 = sc.nextDouble();
		double avg = (n1+n2+n3)/3;
		System.out.println(avg);
		sc.close();
	}
}