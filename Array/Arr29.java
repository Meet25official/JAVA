//29. Write a Java program to compute the average value of an array of integers except the largest and smallest values.


public class Arr29{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		float avg;
		
		for(int i = 0; i<arr.length ; i++){
			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != max && arr[i] != min){
				sum += arr[i]; 
			}
		}
		
		avg = (float)sum / (arr.length-2);
	
		System.out.println("The average of the arrays elements without max and min elements is :- "+avg);
		//System.out.println("The minimum elements of all elementds in the array :- "+min);

	}
}