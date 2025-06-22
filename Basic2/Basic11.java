//11. Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;
public class Basic11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of the circle:- ");
		double n1 = sc.nextDouble();
		double area1 = 3.14*n1*n1;
		double parameter = 2*3.14*n1;
		System.out.println(area1+"  "+parameter);
		sc.close();
	}
}