//13. Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;
public class Basic13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the circle:- ");
		double l = sc.nextDouble();
		System.out.println("Enter the width of the circle:- ");
		double b = sc.nextDouble();
		double area1 = l*b;
		double parameter = 4*(l+b);
		System.out.println(area1+"  "+parameter);
		sc.close();
	}
}