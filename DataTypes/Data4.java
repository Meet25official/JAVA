//4. Write a Java program to convert minutes into years and days.

import java.util.Scanner;
public class Data4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minutes :- ");
		double minutes1 = sc.nextDouble();
		double year1 = minutes1/525600;
		double days1 = minutes1/1440;
		System.out.println((int)minutes1+" minutes is approximately "+(int)year1+" years and "+(int)days1+" days");		
		sc.close();	
	}
}