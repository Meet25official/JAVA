// 1. Write a Java program to print 'Hello' on screen and your name on a separate line.
//Expected Output :
//Hello
//Alexandra Abramov

import java.util.Scanner;
public class Task1{
	public static void main(String[] args){
		String n = "Hello";
		System.out.println(n);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Full Name: ");
		String name = s.nextLine();
		System.out.println(n + "\n" + name);
	}
}