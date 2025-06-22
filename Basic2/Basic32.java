//32. Write a Java program to compare two numbers.


import java.util.Scanner;
public class Basic32{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:- ");
		int a = sc.nextInt();
		System.out.println("Enter the second number:- ");
		int b = sc.nextInt();
		if(a > b){
			System.out.println(a+"!="+b);		
			System.out.println(a+">"+b);
			System.out.println(a+">="+b);					
		}
		else if(a < b){
			System.out.println(a+"!="+b);
			System.out.println(a+"<"+b);
			System.out.println(a+"<="+b);				
		}
		else{
			System.out.println(a+"=="+b);		
		}
		sc.close();
	}
}