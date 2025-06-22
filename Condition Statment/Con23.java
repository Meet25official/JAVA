//23. Write a Java program to generate the following * triangles.

import java.util.Scanner;
public class Con23{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :- ");
		int n = sc.nextInt();
		for(int i = 1; i<=n ; i++){
			for(int j = 0; j < 2 * i; j++){	
				System.out.print(" ");
			}
			for(int k = 0; k < 2 * (n - i) - 1; k++){
					System.out.print("* ");
			}
			System.out.print("\n");
		}
		sc.close();	
	}
}