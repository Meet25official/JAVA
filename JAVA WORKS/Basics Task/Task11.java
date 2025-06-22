//11. Write a Java program to print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586

import java.util.Scanner;
public class Task11{
	public static void main(String[] args){
		double r = 7.5;
        double per = 2 * 3.14 * r;
        double area = 3.14 * r * r;
        System.out.println("Perimeter is = " + per);
        System.out.println("Area is = " + area);
	}
}