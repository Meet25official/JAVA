//6. Write a Java program to compute the body mass index (BMI).

//Test Data
//Input weight in pounds: 452
//Input height in inches: 72
//Expected Output:
//Body Mass Index is 61.30159143458721

import java.util.Scanner;

public class Task6{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double w= s.nextDouble();
        System.out.print("Input height in inches: ");
        double h = s.nextDouble();
        double wkg = w * 0.453592;
        double hme = h * 0.0254;
        double bmi = wkg / (hme * hme);
        System.out.println("Body Mass Index is " + bmi);
    }
}
