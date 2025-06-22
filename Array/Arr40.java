//40. Write a Java program to find the two elements in a given array of positive and negative numbers such that their sum is close to zero.  


public class Arr40{
	public static void main(String[] args){
		
		int arr[] = {-23,34,-56,24,-30,39};
		int count = 0;
		int m1 = 0;
		int m2 = 0;
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i]+", ");
		}
		
		for(int i = 0; i < arr.length ; i++){
			for(int j = i+1; j< arr.length; j++){
				count = arr[i] + arr[j];
				if(count > 0 && count <= 3){
					m1 = arr[i];
					m2 = arr[j];
				}
			}
		}
		
		System.out.println("\nThe positive and negative elements are :- "+m1+" "+m2);
	}

}