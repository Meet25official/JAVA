//20. Write a Java program to convert a decimal number to a hexadecimal number.
//Input Data:
//Input a decimal number: 15
//Expected Output

//Hexadecimal number is : F

 import java.util.Scanner;
 public class Task20{
	 public static void main(String[] args){
		 int dec = 15;
		 String hexa = Integer.toHexString(dec);
		 System.out.println(hexa);
	 }
 }
 