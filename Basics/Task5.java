//5. Implement a program to accept the user's weight and height, and then calculate their BMI (Body Mass Index).


import java.util.Scanner;
public class Task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight(in Kilograms)of the user :- ");
		double weight1 = sc.nextDouble();
		System.out.println("Enter the height(in meters) of the user :- ");
		double height1 = sc.nextDouble();
		double bmi = weight1/(height1*height1);
		System.out.println("The Body Mass Index of the user is :- "+bmi);
		sc.close();
	}
}