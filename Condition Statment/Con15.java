//15. Write a Java program that displays the sum of n odd natural numbers.

import java.util.Scanner;
public class Con15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number term :- ");
		int n = sc.nextInt();
		int sum = 0;
		int len = 0;
		for(int i = 1; i<=100 ; i++){
			if(i%2 != 0){
				System.out.println(i);
				sum += i;
				len++;
			}
			if(len == n) break;
		}
		System.out.println("The sum of first n numebr is :- "+sum);
		sc.close();	
	}
}