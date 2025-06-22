//Write a Java program that accepts three integers from the user. 
//It returns true if the second number is higher than the first number and the third number is larger than the second number. 
//If "abc" is true, the second number does not need to be larger than the first number.

//Sample Output:
//Input the first number : 5                                             
//Input the second number: 10                                            
//Input the third number : 15                                            
//The result is: true

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = s.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = s.nextInt();
        System.out.println("Enter the Third Number: ");
        int c = s.nextInt();
        
		boolean abc = true;
		if(abc){
			System.out.println("The result is: " + (a < b && b < c));
		} 
		else{
			System.out.println("The result is: " + (a < b && b < c));
		}
	}
}
