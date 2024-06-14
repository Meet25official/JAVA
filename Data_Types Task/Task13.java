//13. Write a Java program to compute the floor division and floor modulus of the given dividend and divisor.

import java.util.Scanner;
public class Task13{
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Dividend: ");
        int dividend = s.nextInt();
		System.out.println("Enter the Divisor: ");
        int divisor = s.nextInt();
        int fd = dividend / divisor;
        int fm = dividend - fd * divisor;
        System.out.println("Floor Division: " + fd);
        System.out.println("Floor Modulus: " + fm);
    }
}
