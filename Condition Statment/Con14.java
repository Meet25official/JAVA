//14. Write a Java program to display the multiplication table of a given integer.


import java.util.Scanner;
public class Con14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number if you want to print this table:- ");
		int n = sc.nextInt();
		System.out.print("Enter the number term :- ");
		int term1 = sc.nextInt();
		for(int i = 1; i<=term1 ; i++){
			System.out.println(n+" * "+i+" = "+(n*i));
		}
		sc.close();	
	}
}