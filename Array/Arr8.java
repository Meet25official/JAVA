// 8. Write a Java program to copy an array by iterating the array.


public class Arr8{
	public static void main(String[] args){
		
		int arr[] = {2,34,74,27,89,48,20,18,59};
		int newarr[] = new int[arr.length];
		System.out.println("The original array is :- ");
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i]+", ");
		}
		
		for(int i = 0; i < arr.length ; i++){
			newarr[i] = arr[i];
		}
		
		System.out.println("\nThe coping array is :- ");
		for(int i = 0; i < newarr.length ; i++){
			System.out.print(newarr[i]+", ");
		}
	}

}