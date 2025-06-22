//49. Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
//Sample Output:

//Input a number: 20                                                     
//1

import java.util.Scanner;

public class Task49{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = s.nextInt();
        if(number % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
