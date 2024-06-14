//2. Write a Java program that reads a number in inches and converts it to meters.
//Note: One inch is 0.0254 meter.
//Test Data
//Input a value for inch: 1000
//Expected Output :
//1000.0 inch is 25.4 meters

import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double i = s.nextDouble();
        double m = i * 0.0254;
        System.out.println(i + " inch is equal to " + m + " meters");
    }
}
