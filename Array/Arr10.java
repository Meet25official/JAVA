//10. Write a Java program to find the maximum and minimum value of an array.


import java.util.Scanner;
public class Arr10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i< arr.length ; i++){
			System.out.println("Enter the arr["+i+"] = ");
			arr[i] = sc.nextInt();	
		}
		
		for(int i = 0; i<arr.length ; i++){
			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("The maximum elements of all elementds in the array :- "+max);
		System.out.println("The minimum elements of all elementds in the array :- "+min);
		sc.close();
	}
}