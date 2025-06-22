//32. Write a Java program to check if an array of integers contains two specified elements 65 and 77.

public class Arr32{
	public static void main(String[] args){
		int arr[] = {65,2,3,4,5,6,7,8,9,0};
		for(int i = 0; i<arr.length ; i++){
			if(arr[i] == 65){
				System.out.println("The array have 65");
			}
			if(arr[i] == 77){
				System.out.println("The array have 77");
			}
		}
		
	}
}