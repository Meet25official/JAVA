//21. Write a Java program to convert a decimal number to an octal number.
//Input Data:
//Input a Decimal Number: 15
//Expected Output

//Octal number is: 17  

import java.util.Scanner;
public class Task21{
	public static void main(String[] args){
		int dec = 15;
		 String oct = Integer.toOctalString(dec);
		 System.out.println(oct); 
	}
}