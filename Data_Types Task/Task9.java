//9. Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).

//Test Data
//Input 1st integer: 25
//Input 2nd integer: 5
//Expected Output :
//Sum of two integers: 30
//Difference of two integers: 20
//Product of two integers: 125
//Average of two integers: 15.00
//Distance of two integers: 20
//Max integer: 25
//Min integer: 5

import java.util.Scanner;
public class Task9{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int num1 = s.nextInt();
        System.out.print("Input 2nd integer: ");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        int dif = num1 - num2;
        int pro = num1 * num2;
        double ave = (num1 + num2) / 2;
        int dis = Math.abs(num1 - num2);
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        System.out.println("Sum of two integers: " + sum);
        System.out.println("Difference of two integers: " + dif);
        System.out.println("Product of two integers: " + pro);
        System.out.printf("Average of two integers: %.2f%n", ave);
        System.out.println("Distance of two integers: " + dis);
        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);
    }
}
