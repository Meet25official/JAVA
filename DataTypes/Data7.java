//7. Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

import java.util.Scanner;
public class Data7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in meters :- ");
		double d = sc.nextDouble();
		System.out.println("Enter the time in hours :- ");
		double t1 = sc.nextDouble();
		System.out.println("Enter the time in minutes :- ");
		double t2 = sc.nextDouble();
		System.out.println("Enter the time in seconds :- ");
		double t3 = sc.nextDouble();
		double speed1 = d/t3;
		double speed2 = d/(t1*1000);
		double speed3 = d/(t1*1609);
		System.out.println("Your speed in meters/second is "+speed1);
		System.out.println("Your speed in km/h is "+speed2);		
		System.out.println("Your speed in miles/h is "+speed3);
		sc.close();	
	}
}