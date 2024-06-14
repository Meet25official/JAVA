//5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

//Test Data
//Input number: 3
//Expected Output :
//Wednesday

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
        return dayName;
    }
}

