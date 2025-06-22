//17. Write a Java program to find the second largest element in an array.

import java.util.Arrays;
public class Arr17{
	public static void main(String[] args){
		int arr[] = {12,45,67,89,47,80,16,29,40};
		Arrays.sort(arr);		
		System.out.println("The maximum elements of all elementds in the array :- "+arr[arr.length-1]);
		System.out.println("The minimum elements of all elementds in the array :- "+arr[arr.length-2]);

	}
}
