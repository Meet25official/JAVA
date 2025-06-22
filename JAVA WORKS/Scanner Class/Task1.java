// 1. Write a Java program to take the user's name as input and display a personalized greeting message.
import java.util.Scanner;

public class Task1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:- ");
		String name1 = sc.next();
		System.out.println("Hii , "+name1+" Good Morning");	
		sc.close();
	}
}