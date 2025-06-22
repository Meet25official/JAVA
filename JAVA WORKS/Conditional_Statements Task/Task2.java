//2. Write a Java program to solve quadratic equations (use if, else if and else).

//Test Data
//Input a: 1
//Input b: 5
//Input c: 1
//Expected Output :
//The roots are -0.20871215252208009 and -4.7912878474779195

import java.util.Scanner;

public class Task2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Input a: ");
		double a = s.nextDouble();
		System.out.println("Input b: ");
		double b = s.nextDouble();
		System.out.println("Input c: ");
		double c = s.nextDouble();
		
		double d = b * b - 4 * a * c; 
		if(d > 0){
			double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);  
			double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);  
			System.out.println("The roots are " + r1 + " and " + r2);  
		}
		else if(d == 0){
			double r1 = -b / (2 * a);  
			System.out.println("The root is " + r1); 
		}
		else{
			System.out.println("Roots are not real.");  
		}
	}
}