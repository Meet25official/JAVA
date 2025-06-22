//17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.

//The pattern is as follows :

//1
//22
//333
//4444

import java.util.Scanner;
public class Task17{
	public static void main(String[] args){
		int i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = s.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
}