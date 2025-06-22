//8. Develop a program to take the user's marks in three subjects (Math, Science, and English) and calculate their average score.


import java.util.Scanner;
public class Task8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of maths:- ");
		double m1 = sc.nextDouble();
		System.out.println("Enter the marks of Science:- ");
		double m2 = sc.nextDouble();
		System.out.println("Enter the marks of English:- ");
		double m3 = sc.nextDouble();
		double avg = (m1+m2+m3)/3;
		System.out.println("The average marks of the user is :- "+avg);
		sc.close();
	}
}