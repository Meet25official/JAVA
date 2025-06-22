//31. Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.


public class Arr31{
	public static void main(String[] args){
		int arr[] = {10,2,3,10,5,6,7,8,9,10};
		int sum1 = 0;
		for(int i = 0; i<arr.length ; i++){
			if(arr[i] == 10){
				sum1 += arr[i];
			}
		}
		if(sum1 == 30){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		
	}
}