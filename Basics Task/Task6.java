//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5

import java.util.Scanner;
public class Task6{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number_1 : ");
		int num1 = s.nextInt();
		System.out.println("Enter the Number_2 : ");
		int num2 = s.nextInt();
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " x " + num2 + " = " + mul);
		System.out.println(num1 + " / " + num2 + " = " + div);
		System.out.println(num1 + " % " + num2 + " = " + mod);
	}
}