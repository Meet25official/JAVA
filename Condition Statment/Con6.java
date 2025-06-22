//6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.


import java.util.Scanner;
public class Con6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input floating-point number: ");
		float a = sc.nextFloat();
		System.out.println("Input floating-point another number:");
		float b = sc.nextFloat();
		if(a == b){
			System.out.println("The number are same.");
		}
		else{
			System.out.println("The number are diffrence.");
		}
		sc.close();
	}
}