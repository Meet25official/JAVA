//29. Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.


import java.util.Scanner;
public class Con29{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number :- ");
		int a = sc.nextInt();
		int len = 0;
		while(a>0){
			a/=10;
			len++;
		}
		System.out.println("Number of digits in the number :- "+len);
		sc.close();	
	}
}