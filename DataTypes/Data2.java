//2. Write a Java program that reads a number in inches and converts it to meters.

import java.util.Scanner;
public class Data2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in inches :- ");
		float i = sc.nextFloat();
		float m = i*(0.0254f);
		System.out.println("Enter the number in meters :- "+m);		
		sc.close();	
	}
}