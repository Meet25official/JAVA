//19. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.


import java.util.Scanner;
public class Con19{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :- ");
		int n = sc.nextInt();
		for(int i = 1; i<=n ; i++){
			for(int j = i ; j<=n ; j++){	
				System.out.print("  ");
			}
			for(int k = 1 ; k<=2*i-1 ; k++){
					System.out.print(i+" ");
			}
			System.out.print("\n");
		}
		sc.close();	
	}
}