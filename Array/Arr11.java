//11. Write a Java program to reverse an array of integer values.


import java.util.Scanner;
public class Arr11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int arr1[] = new int[10];
		for(int i = 0; i< arr.length ; i++){
			System.out.println("Enter the arr["+i+"] = ");
			arr[i] = sc.nextInt();	
		}
		
		for(int i = 0; i<arr.length ; i++){
			System.out.print(arr[i] + ", ");
		}
		for(int i = 0; i< arr.length ; i++){
			for(int j = arr.length -1; j >= 0 ; j--){
				arr1[j] = arr[i];
				i++;
			}
		}
		
		System.out.println("The reverse Array is :- ");
		for(int i = 0; i<arr1.length ; i++){
			System.out.print(arr1[i] + ", ");
		}
		sc.close();
	}
}