//25. Write a Java program to convert a octal number to a decimal number.
//Input Data:
//Input any octal number: 10
//Expected Output

//Equivalent decimal number: 8

import java.util.Scanner;
public class Task25{
    public static void main(String[] args) {
        String octa = "10";
        int dec = Integer.parseInt(octa, 8);
        System.out.println(dec);
    }
}
