//21. Write a Java program to display the pattern like a diamond.

import java.util.Scanner;
public class Con21{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :- ");
		int n = sc.nextInt();
		for(int i = 0; i<n ; i++){
			for(int j = n-i; j >0; j--){	
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i - 1; k++){
					System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i = n; i>0 ; i--){
			for(int j = n-i; j >0; j--){	
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i - 1; k++){
					System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();	
	}
}
