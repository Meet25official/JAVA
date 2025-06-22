//33. Write a Java program and compute the sum of an integer's digits.

import java.util.Scanner;
public class Basic33{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number :- ");
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