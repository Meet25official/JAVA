//13. Write a Java program to print the area and perimeter of a rectangle.
//Test Data:
//Width = 5.5 Height = 8.5

//Expected Output
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20

import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        double w = 5.6;
        double h = 8.5;
        
        double area = w * h;
        
        double per = 2 * (w + h);
        
        System.out.println("Area is " + w + " * " + h + " = " + area);
        System.out.println("Perimeter is 2 * (" + w + " + " + h + ") = " + per);
    }
}
