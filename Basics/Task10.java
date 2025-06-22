//10. Implement a basic calculator program that accepts two numbers and an operator (+, -, *, /) as input, performs the corresponding operation, and displays the result.


import java.util.Scanner;
public class Task10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:- ");
		double a = sc.nextDouble();
		System.out.println("Enter the second number:- ");
		double b = sc.nextDouble();
		double sum = a+b;
		double sub = a-b;
		double mul = a*b;
		double div = a/b;
		System.out.println("a + b = "+sum);
		System.out.println("a - b = "+sub);
		System.out.println("a * b = "+mul);
		System.out.println("a / b = "+div);
		sc.close();
	}
}