//29. Write a Java program to convert a hexadecimal number into a binary number.
//Input Data:
//Enter Hexadecimal Number : 37
//Expected Output

//Equivalent Binary Number is: 110111

import java.util.Scanner;

public class Task29{
    public static void main(String[] args) {
        String hex = "37";
        int dec = Integer.parseInt(hex, 16);
        String binary = Integer.toBinaryString(dec);
        System.out.println(binary);
    }
}
