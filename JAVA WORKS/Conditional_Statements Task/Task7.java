/*7. Write a Java program to find the number of days in a month.

Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days 
*/

import java.util.Scanner;
public class Task7 {

    
  public static void main(String[] strings) {

        Scanner s = new Scanner(System.in);

        int num = 0; 
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = s.nextInt();

        System.out.print("Input a year: ");
        int year = s.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                num = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    num = 29;
                } else {
                    num = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                num = 31;
                break;
            case 4:
                MonthOfName = "April";
                num = 30;
                break;
            case 5:
                MonthOfName = "May";
                num = 31;
                break;
            case 6:
                MonthOfName = "June";
                num = 30;
                break;
            case 7:
                MonthOfName = "July";
                num = 31;
                break;
            case 8:
                MonthOfName = "August";
                num = 31;
                break;
            case 9:
                MonthOfName = "September";
                num = 30;
                break;
            case 10:
                MonthOfName = "October";
                num = 31;
                break;
            case 11:
                MonthOfName = "November";
                num = 30;
                break;
            case 12:
                MonthOfName = "December";
                num = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + num + " days\n");
    }
}

