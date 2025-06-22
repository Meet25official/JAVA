//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.


import java.util.Scanner;
public class Basic6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :- ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number:- ");
		int n2 = sc.nextInt();
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		sc.close();
	}
}