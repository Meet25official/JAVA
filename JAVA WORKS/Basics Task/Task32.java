//32. Write a Java program to compare two numbers.
//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output

//25 != 39                                                                          
//25 < 39                                                                           
//25 <= 39
import java.util.Scanner;

public class Task32{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input first integer: ");
        int num1 = s.nextInt();
        System.out.println("Input second integer: ");
        int num2 = s.nextInt();
        System.out.println(num1 + "!= " + num2);
        System.out.println(num1 + " < " + num2);
		System.out.println(num1 + " <= " + num2);
    }
}