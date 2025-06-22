//29. Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.

//Test Data
//Input an integer number less than ten billion: 125463
//Expected Output :

//Number of digits in the number: 6

import java.util.Scanner;
public class Task29{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Input an integer number less than ten billion: ");
		int num = s.nextInt();
		int len = 0; 
		while(num>0){
			num/=10;
			len++;
		}
		System.out.println("Number of digits in the number: " + len);
	}
}