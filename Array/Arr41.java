//41. Write a Java program to find the smallest and second smallest elements of a given array.  

import java.util.Arrays;  
public class Arr41{
	public static void main(String[] args){
		int arr[] = {34,70,16,69,25,38,49,51,73,20};
		
		for(int i = 0; i<arr.length ; i++){
			System.out.print(arr[i]+", ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe smallest elements of this array is :- "+arr[0]);
		System.out.println("The second smallest elements of this array is :- "+arr[1]);	
	}
}