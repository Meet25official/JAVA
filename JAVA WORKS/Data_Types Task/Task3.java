//3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

//Test Data
//Input an integer between 0 and 1000: 565
//Expected Output :
//The sum of all digits in 565 is 16

import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int number = s.nextInt();
        int sum = 0;
        int orinum= number; 
        while (number != 0) {
            sum += number % 10; 
            number /= 10; 
        }
        System.out.println("The sum of all digits in " + orinum + " is " + sum);
    }
}
