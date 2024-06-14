//30. Write a Java program to convert a hexadecimal value into an octal number.
//Input Data:
//Input a hexadecimal number: 40
//Expected Output

//Equivalent of octal number is: 100

import java.util.Scanner;

public class Task30{
    public static void main(String[] args) {
        String hex = "40";
        int dec = Integer.parseInt(hex, 16);
        String oct = Integer.toOctalString(dec);
        System.out.println(oct);
    }
}
