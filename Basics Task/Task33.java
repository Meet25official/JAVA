//33. Write a Java program and compute the sum of an integer's digits.
//Input Data:
//Input an integer: 25
//Expected Output

//The sum of the digits is: 7

import java.util.Scanner;
public class Task33{
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = s.nextInt();
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit; 
            number /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);	
	}
}
