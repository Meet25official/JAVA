//3. Build a Java application to collect the user's contact information (name, email, and phone number) and display it back to them.


import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the user :- ");
		String name1 = sc.nextLine();
		System.out.println("Enter the email of the user :- ");
		String email1 = sc.next();
		System.out.println("Enter the Phone Number of the user :- ");
		String num = sc.next();
		System.out.println("Name of the User is :- "+name1+"\nThe email of the user is :- "+email1+"\nThe Phone Number of the user is :- "+num);
		sc.close();
	}
}