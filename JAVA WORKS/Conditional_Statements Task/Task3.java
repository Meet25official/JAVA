//3. Write a Java program that takes three numbers from the user and prints the greatest number.

//Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87
//Expected Output :
//The greatest: 87

import java.util.Scanner;

public class Task3{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Input the 1st Number: ");
		int num1 = s.nextInt();
		System.out.println("Input the 2nd Number: ");
		int num2 = s.nextInt();
		System.out.println("Input the 3rd Number: ");
		int num3 = s.nextInt();
		if(num1 > num2){
			if(num1 > num3){
				System.out.println("The greatest: " + num1);
			}
		}
		if(num2 > num1){
			if(num2 > num3){
				System.out.println("The greatest: " + num2);
			}
		}
		if(num3 > num1){
			if(num3 > num2){
				System.out.println("The greatest: " + num3);
			}
		}
	}
}