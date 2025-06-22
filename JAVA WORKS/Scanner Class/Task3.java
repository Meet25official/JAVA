// 3. Build a Java application to collect the user's contact information (name, email, and phone number) and display it back to them.
import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Information:- ");
		System.out.println("Enter the Name:- ");
		String name = sc.next();
		System.out.println("Enter the Email:- ");
		String email = sc.next();
		System.out.println("Enter the Phone Number:- ");
		String phone = sc.next(); 
		System.out.println("My information: " + name + "," + email + "," + phone );
	}
}