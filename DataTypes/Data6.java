//6. Write a Java program to compute the body mass index (BMI).

import java.util.Scanner;
public class Data6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weigth in pounds :- ");
		double w = sc.nextDouble();
		System.out.println("Enter the height in inches :- ");
		double h = sc.nextDouble();
		double weigth1 = w / 2.20462;
		double height1 = h * 0.0254;
		double BMI1 = weigth1/(height1*height1);
		System.out.println("Body Mass Index is : "+BMI1);	
		sc.close();	
	}
}