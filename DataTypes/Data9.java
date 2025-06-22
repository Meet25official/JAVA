//9. Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).

import java.util.Scanner;
public class Data9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first /integers :- ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double sum1 = a+b;
		double sub1 = a-b;
		double mul1 = a*b;
		double avg = (a+b)/2;
		double dif = a-b;
		double max1 = a>b?a:b;
		double min1 = a<b?a:b;
		System.out.println("Sum of two integers "+sum1);		
		System.out.println("Difference of two integers : "+sub1);		
		System.out.println("Product of two integers : "+mul1);		
		System.out.println("Average of two integers : "+avg);		
		System.out.println("Distance of two integers : "+dif);		
		System.out.println("Max integer : "+max1);		
		System.out.println("Min integer : "+min1);		
		sc.close();	
	}
}