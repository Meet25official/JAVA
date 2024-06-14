//3. Write a Java program to divide two numbers and print them on the screen.
//Test Data :
//50/3
//Expected Output :
//16

import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number_1 : ");
		int num1 = s.nextInt();
		System.out.println("Enter the Number_2 : ");
		int num2 = s.nextInt();
		int div = num1 / num2;
		System.out.println(div);
	}
}