//8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.Scanner;
public class Con8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the only one character string:- ");
		String str1 = sc.next();
		if(str1.length() > 1){
			System.out.println("Invalid Lenght of the string Enter only one character.");
		}
		else{
			if(str1 == "A" || str1 == "E" || str1 == "I" || str1 == "O" || str1 == "U" || str1 == "a" || str1 == "e" || str1 == "i" || str1 == "o" || str1 == "u"){
				    System.out.println("Input letter is Consonant");
			}
			else{
				System.out.println("Input letter is Consonant");
			}
		}
		sc.close();	
	}
}