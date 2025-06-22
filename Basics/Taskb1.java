//1. Write a Java program to print 'Hello' on screen and your name on a separate line.

import java.util.Scanner;
public class Taskb1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the user :- ");
		String name1 = sc.next();
		System.out.println("Hello,\n"+name1);
		sc.close();
	}
}
