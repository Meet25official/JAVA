//2. Write a Java program to sum values of an array.                              


import java.util.Scanner;
public class Arr1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int sum1 = 0;
		for(int i = 0; i< arr.length ; i++){
			System.out.println("Enter the arr["+i+"] = ");
			arr[i] = sc.nextInt();	
		}
		
		for(int i = 0; i<arr.length ; i++){
			sum1 += arr[i];
		}
		System.out.println("The sum of all elementds of the array :- "+sum1);
		sc.close();
	}
}