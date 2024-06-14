//8. Write a Java program that reads a number and displays the square, cube, and fourth power.

//Expected Output:
//Square: .2f
//Cube: .2f
//Fourth power: 50625.00

import java.util.Scanner;

public class Task8{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = s.nextDouble();
        double square = Math.pow(num, 2);
        double cube = Math.pow(num, 3);
        double fourthPower = Math.pow(num, 4);
        System.out.printf("Square: %.2f%n", square);
        System.out.printf("Cube: %.2f%n", cube);
        System.out.printf("Fourth power: %.2f%n", fourthPower);
    }
}
