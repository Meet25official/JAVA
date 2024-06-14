//23. Write a Java program to convert a binary number to a hexadecimal number.
//Input Data:
//Input a Binary Number: 1101
//Expected Output

//HexaDecimal value: D

import java.util.Scanner;

public class Task23{
    public static void main(String[] args) {
        String binary = "1101";
        int dec = Integer.parseInt(binary, 2);
        String hexa = Integer.toHexString(dec);
        System.out.println(hexa);
    }
}
