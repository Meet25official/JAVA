//27. Write a Java program that reads an integer and check whether it is negative, zero, or positive.

import java.util.Scanner;
public class Con27{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number :- ");
		int a = sc.nextInt();
		if((a>0)){
			System.out.println(a+"The number is positive.");
		}
		else if(a<0){
			System.out.println(a+"The number is negative");
		}
		else{
			System.out.println("The number is zero");
		}
		sc.close();	
	}
}