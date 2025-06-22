//4. Write a Java program to convert minutes into years and days.

//Test Data
//Input the number of minutes: 3456789
//Expected Output :
//3456789 minutes is approximately 6 years and 210 days


import java.util.Scanner;

public class Task4{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        long min = s.nextLong();
        long years = min / (60 * 24 * 365);
        long remin = min % (60 * 24 * 365);
        long days = remin / (60 * 24);
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
