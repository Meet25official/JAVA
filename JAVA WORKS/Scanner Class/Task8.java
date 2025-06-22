//8. Develop a program to take the user's marks in three subjects (Math, Science, and English) and calculate their average score.
import java.util.Scanner;
public class Task8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Math marks: ");
		double m = sc.nextDouble();
		System.out.println("Enter the Science marks: ");
		double s = sc.nextDouble();
		System.out.println("Enter the English marks: ");
		double e = sc.nextDouble();
		double avg = (m+s+e)/3;
		System.out.println("The Average Score is: " + avg);
		sc.close();
	}
}