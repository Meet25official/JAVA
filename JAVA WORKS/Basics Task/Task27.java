//27. Write a Java program to convert a octal number to a hexadecimal number.
//Input Data:
//Input a octal number : 100
//Expected Output

//Equivalent hexadecimal number: 40

import java.util.Scanner;

public class Task27{
    public static void main(String[] args) {
        String oct = "100";
        int dec = Integer.parseInt(oct, 8);
        String hex = Integer.toHexString(dec);
        System.out.println(hex);
    }
}
