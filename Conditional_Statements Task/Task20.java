//20. Write a Java program to print Floyd's Triangle.

//Test Data
//Input number of rows : 5
//Expected Output :

//Input number of rows :  5
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15

import java.util.Scanner;
public class Task20{
	public static void main(String[] args){
		int i,j,k = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = s.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(k++);
			}
			System.out.println(" ");
		}
	}
}