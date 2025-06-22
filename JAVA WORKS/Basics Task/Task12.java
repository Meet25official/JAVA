//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Task12{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
		
        System.out.print("Enter the first number: ");
        double num1 = s.nextDouble();
		
        System.out.print("Enter the second number: ");
        double num2 = s.nextDouble();
		
        System.out.print("Enter the third number: ");
        double num3 = s.nextDouble();
		
        double ave = (num1 + num2 + num3) / 3;
		
        System.out.println("The average of the three numbers is: " + ave);
    }
}
