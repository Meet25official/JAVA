//5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

import java.util.Scanner;
public class Con5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("1----------------->Monday");
		System.out.println("2----------------->Tuesday");
		System.out.println("3----------------->Wedensday");
		System.out.println("4----------------->Thursday");
		System.out.println("5----------------->Friday");
		System.out.println("6----------------->Saturday");
		System.out.println("7----------------->Sunday");
		System.out.println("Enter the your choice :- ");
		int choice = sc.nextInt();
		
		switch(choice){
			case 1: System.out.println("Monday");		
					break;
			case 2: System.out.println("Tuesday");		
					break;
			case 3: System.out.println("Wedensday");		
					break;
			case 4: System.out.println("Thursday");		
					break;
			case 5: System.out.println("Friday");		
					break;
			case 6: System.out.println("Saturday");		
					break;
			case 7: System.out.println("Sunday");		
					break;
		}
		sc.close();
	}
}