//1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
//Test Data
//Input a degree in Fahrenheit: 212
//Expected Output:
//212.0 degree Fahrenheit is equal to 100.0 in Celsius

import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double f = s.nextDouble();
        double cel = (f - 32) * 5 / 9;
        System.out.println(f + " degree Fahrenheit is equal to " + cel + " in Celsius");
    }
}
