//13. Write a Java program to display the cube of the given number up to an integer.


import java.util.Scanner;
import java.lang.Math;
public class Con13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number term :- ");
		int term1 = sc.nextInt();
		for(int i = 1; i<=term1 ; i++){
			System.out.println("Number is: "+i+" and their cube is :- "+(Math.pow(i,3)));
		}
		sc.close();	
	}
}