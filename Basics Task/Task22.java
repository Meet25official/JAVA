//22. Write a Java program to convert a binary number to a decimal number.
//Input Data:
//Input a binary number: 100
//Expected Output

//Decimal Number: 4 

import java.util.Scanner;
public class Task22{
	public static void main(String[] args){
		String bin = "100";
		int dec = Integer.parseInt(bin,2);
		System.out.println(dec);
  }
} 
