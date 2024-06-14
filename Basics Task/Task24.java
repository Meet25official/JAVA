//24. Write a Java program to convert a binary number to an octal number.
//Input Data:
//Input a Binary Number: 111
//Expected Output

//Octal number: 7

import java.util.Scanner;

public class Task24{
    public static void main(String[] args) {
        String binary = "111";
        int dec = Integer.parseInt(binary, 2);
        String oct = Integer.toOctalString(dec);
        System.out.println(oct);
    }
}
