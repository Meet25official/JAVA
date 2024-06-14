//5. Write a Java program that takes two numbers as input and displays the product of two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125

import java.util.Scanner;
public class Task5{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number_1 : ");
		int num1 = s.nextInt();
		System.out.println("Enter the Number_2 : ");
		int num2 = s.nextInt();
		int mul = num1 * num2;
		System.out.println(num1 + " x " + num2 + " = " + mul);
	}
}