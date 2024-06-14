//15. Write a Java program to swap two variables.

import java.util.Scanner;
public class Task15{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		System.out.println("Enter the A variable");
        int a = s.nextInt();
		System.out.println("a = " + a);
		System.out.println("Enter the B variable");
        int b = s.nextInt();
		System.out.println("b = " + b);
      
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
