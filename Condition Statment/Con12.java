//12. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

import java.util.Scanner;
public class Con12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the five number :- ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		int sum1 = n1 + n2 + n3 + n4 + n5;
		float avg = sum1/5;
		System.out.println("The sum of this numbers is :- "+sum1);
		System.out.println("The average of this numbers is :- "+avg);
		sc.close();	
	}
}