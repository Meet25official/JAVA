//10. Implement a basic calculator program that accepts two numbers and an operator (+, -, *, /) as input, performs the corresponding operation, and displays the result.
import java.util.Scanner;
public class Task10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number:- ");
		double num1 = sc.nextDouble();
		System.out.println("Enter the Second Number:- ");
		double num2 = sc.nextDouble();
		double sum = num1 + num2;
		double sub = num1 - num2;
		double mul = num1 * num2;
		double div = num1 / num2;
		System.out.println("num1 + num2 = "+sum);
		System.out.println("num1 - num2 = "+sub);
		System.out.println("num1 * num2 = "+mul);
		System.out.println("num1 / num2 = "+div);
		sc.close();
	}
}