//15. Write a Java program to swap two variables.

import java.util.Scanner;
public class Basic15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:- ");
		int a = sc.nextInt();
		System.out.println("Enter the second number:- ");
		int b = sc.nextInt();
		System.out.println("Before swaping a = "+a+" and b = "+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swaping a = "+a+" and b = "+b);	
		sc.close();	
	}
}