//30. Write a Java program to check if an array of integers is without 0 and -1.


public class Arr30{
	public static void main(String[] args){
		int arr[] = {65,3,4,5,6,7,8,9};
		for(int i = 0; i<arr.length ; i++){
			if(arr[i] != 0){
				System.out.println("The array not have 0");
			}
			if(arr[i] != -1){
				System.out.println("The array not have -1");
			}
		}
		
	}
}