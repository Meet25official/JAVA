//3. Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner;
public class Con3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a :- ");
		int a = sc.nextInt();
		System.out.println("Enter the b :- ");
		int b = sc.nextInt();
		System.out.println("Enter the c :- ");
		int c = sc.nextInt();
		if(a > b && a > c){
			System.out.println("The greatest number is :- "+a);
		}
		else if(b > a && b > c){
			System.out.println("The greatest number is :- "+b);
		}
		else{
			System.out.println("The greatest number is :- "+c);
		}
		sc.close();
	}
}