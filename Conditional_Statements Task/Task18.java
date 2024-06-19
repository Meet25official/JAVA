//18. Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.

//The pattern like :

//1
//2 3
//4 5 6
//7 8 9 10

import java.util.Scanner;
public class Task18{
	public static void main(String[] args){
		int i,j,k = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = s.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(k++);
			}
			System.out.println("");
		}
	}
}