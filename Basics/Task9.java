//9. Create a program that asks the user for their address, including street, city, state, and zip code, and displays the complete address.

import java.util.Scanner;
public class Task9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the address of the user using this  technique:- ");
		System.out.println("Enter the street of the user :- ");
		String street1 = sc.nextLine();
		System.out.println("Enter the city of the user :- ");
		String city1 = sc.nextLine();
		System.out.println("Enter the state of the user :- ");
		String state1 = sc.nextLine();
		System.out.println("Enter the zip code of the user :- ");
		String zip1 = sc.nextLine();
		System.out.println("The address of the user is :- ");
		System.out.println(street1+ "," +city1+ "," +state1+ "," +zip1);
		sc.close();
	}
}