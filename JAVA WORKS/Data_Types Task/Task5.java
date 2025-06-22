//5. Write a Java program that prints the current time in GMT.

//Test Data
//Input the time zone offset to GMT: 256
//Expected Output:
//Current time is 23:40:24

import java.util.Scanner;
public class Task5{
    public static void main(String[] Strings) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = s.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
