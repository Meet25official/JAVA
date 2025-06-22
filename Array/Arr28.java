//28. Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1.

public class Arr28{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length ; i++){
			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("The difference between  maximum minimum value of the array :- "+(max-min));
	}
}