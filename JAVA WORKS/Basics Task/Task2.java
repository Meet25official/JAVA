//2. Write a Java program to print the sum of two numbers.
//Test Data:
//74 + 36
//Expected Output :
//110

import java.util.Scanner;
public class Task2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number_1 : ");
		int num1 = s.nextInt();
		System.out.println("Enter the Number_2 : ");
		int num2 = s.nextInt();
		int sum = num1 + num2;
		System.out.println(sum);
	}
}