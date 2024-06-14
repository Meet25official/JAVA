//28. Write a Java program to convert a hexadecimal value into a decimal number.
//Input Data:
//Input a hexadecimal number: 25
//Expected Output

//Equivalent decimal number is: 37

import java.util.Scanner;

public class Task28{
    public static void main(String[] args) {
        String hexa = "25";
        int dec = Integer.parseInt(hexa, 16);
        System.out.println(dec);
    }
}
