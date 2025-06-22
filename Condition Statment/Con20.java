//20. Write a Java program to print Floyd's Triangle.


import java.util.Scanner;
public class Con20{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :- ");
		int n1 = sc.nextInt();
		int k =1;
		for(int i = 1; i<=n1 ; i++){
			for(int j = 1 ; j<=i ; j++){
				System.out.print(k+" ");
				k++;
			}
			System.out.print("\n");
		}
		sc.close();	
	}
}