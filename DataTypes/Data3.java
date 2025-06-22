//3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

import java.util.Scanner;
public class Data3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number from 0 to 1000 :- ");
		int a = sc.nextInt();
		int sum = 0;
		System.out.println(a);
		while(a > 0){
			int rem = a%10;
			sum += rem;
			a /= 10;
		}
		System.out.println("The sum of all digits is:- "+sum);
		sc.close();	
	}
}