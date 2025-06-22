//26. Write a Java program to convert a octal number to a binary number.
//Input Data:
//Input any octal number: 7
//Expected Output

//Equivalent binary number: 111

import java.util.Scanner;

public class Task26{
    public static void main(String[] args) {
        String oct = "7";
        int dec = Integer.parseInt(oct, 8);
        String binary = Integer.toBinaryString(dec);
        System.out.println(binary);
    }
}
