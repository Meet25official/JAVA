//5. Write a Java program that takes two numbers as input and displays the product of two numbers.


import java.util.Scanner;
public class Basic5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :- ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number:- ");
		int n2 = sc.nextInt();
		System.out.println(n1*n2);
		sc.close();
	}
}