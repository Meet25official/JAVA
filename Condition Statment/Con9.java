//9. Write a Java program that takes a year from the user and prints whether it is a leap year or not.


import java.util.Scanner;
public class Con9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any year :- ");
		int a = sc.nextInt();
		if((a%4 == 0 && a%100 != 0)||(a%400 == 0)){
			System.out.println(a+"The year is leap year.");
		}
		else{
			System.out.println(a+"The year is not leap year.");
		}
		sc.close();	
	}
}