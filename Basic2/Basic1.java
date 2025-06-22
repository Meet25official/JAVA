//1. Write a Java program to print 'Hello' on screen and your name on a separate line.

import java.util.Scanner;
public class Basic1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :- ");
		String name1 = sc.nextLine(); 
		System.out.println("Hello\n"+name1);
		sc.close();
	}
}