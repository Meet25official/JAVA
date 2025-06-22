//16. Write a Java program to display the pattern like a right angle triangle with a number.

import java.util.Scanner;
public class Con16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :- ");
		int n1 = sc.nextInt();
		for(int i = 1; i<=n1 ; i++){
			for(int j = 1 ; j<=i ; j++){
				System.out.print(j);
			}
			System.out.print("\n");
		}
		sc.close();	
	}
}