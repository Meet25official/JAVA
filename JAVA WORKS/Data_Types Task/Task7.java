//7. Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

//Test Data
//Input distance in meters: 2500
//Input hour: 5
//Input minutes: 56
//Input seconds: 23
//Expected Output :
//Your speed in meters/second is 0.11691531
//Your speed in km/h is 0.42089513
//Your speed in miles/h is 0.26158804

import java.util.Scanner;

public class Task7{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        double dme = s.nextDouble();
        System.out.print("Input hour: ");
        int hours = s.nextInt();
        System.out.print("Input minutes: ");
        int min = s.nextInt();
        System.out.print("Input seconds: ");
        int sec = s.nextInt();
        double totalts = hours * 3600 + min * 60 + sec;
        double sms = dme / totalts;
        double skh = (dme / 1000) / (totalts / 3600);
        double smh= (dme / 1600) / (totalts / 3600);
        System.out.println("Your speed in meters/second is " + sms);
        System.out.println("Your speed in km/h is " + skh);
        System.out.println("Your speed in miles/h is " + smh);
    }
}
