//19. Write a Java program to convert an integer number to a binary number.
//Input Data:
//Input a Decimal Number : 5
//Expected Output

//Binary number is: 101 

import java.util.Scanner;
public class Task19{
	public static void main(String[] args){
		int decimal = 5;
		String binary = Integer.toBinaryString(decimal);
		System.out.println(binary);
	}
}