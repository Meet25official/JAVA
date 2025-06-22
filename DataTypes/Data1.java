//1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.

import java.util.Scanner;
public class Data1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit :- ");
		float f = sc.nextFloat();
		float c = (f - 32)*5/9;
		System.out.println("Enter the temperature in Celsius :- "+c);	
		sc.close();	
	}
}