//10. Write a Java program to break an integer into a sequence of digits.

import java.util.Scanner;
public class Data10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input six non-negative digits :- ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt(); 
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		int n6 = sc.nextInt();
		System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);		
		sc.close();	
	}
}