// 9. Write a Java program that takes a year from the user and prints whether it is a leap year or not.

// Test Data
// Input the year: 2016
// Expected Output :
// 2016 is a leap year

import java.util.Scanner;
public class Task9 {

    
  public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = s.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
