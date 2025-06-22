//27. Write a Java program to find the number of even and odd integers in a given array of integers.


public class Arr27{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("The even number is :- ");
		for(int i = 0; i < arr.length; i++){
			if(arr[i] %2 == 0){
				System.out.print(arr[i]+", "); 
			}
		}
		System.out.println("\nThe odd number is :- ");
		for(int i = 0; i < arr.length; i++){
			if(arr[i] %2 != 0){
				System.out.print(arr[i]+", "); 
			}
		}
		
	}
}