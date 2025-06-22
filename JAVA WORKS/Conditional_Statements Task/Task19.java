//19. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

//       1
//      2 2
//     3 3 3
//    4 4 4 4 

import java.util.Scanner;
public class Task19{
	public static void main(String[] args){
		int i,j,k;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = s.nextInt();
		for(i=1;i<=n;i++){
			for(j=i;j<=n;j++){
				System.out.print("  ");
			}
			for(k = 1; k <= 2*i - 1; k++){
				System.out.print(i + " ");
			}
			System.out.println("\n");
		}
	}
}