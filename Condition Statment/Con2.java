//2. Write a Java program to solve quadratic equations (use if, else if and else).

import java.util.Scanner;
import java.lang.Math;
public class Con2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a :- ");
		double a = sc.nextDouble();
		System.out.println("Enter the b :- ");
		double b = sc.nextDouble();
		System.out.println("Enter the c :- ");
		double c = sc.nextDouble();
		double s = (b*b) - (4*a*c);
		double D = Math.sqrt(s);
		if(s > 0){
			double ans = (-b + D)/(2*a);
			double ans1 = (-b - D)/(2*a);
			System.out.println("The quadratic function has two distinct real roots :- ");
			System.out.println("The roots are :- "+ans+" and "+ans1);
		}
		else if(s < 0){
			System.out.println("The quadratic function has no real roots.");
		}
		else if(s == 0){
			System.out.println("The quadratic function has one repeated real root :- ");
			double ans2 = (-b)/(2*a);
			System.out.println("The roots are :- "+ans2);
		}
		sc.close();
	}
}