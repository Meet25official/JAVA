//38. Write a Java program to get the majority element from an array of integers containing duplicates.  


public class Arr38{
	public static void main(String[] args){
		
		int arr[] = {2,34,74,27,34,48,34,18,34,34};
		int count = 0;
		int n = arr.length;
		int maj = 0;
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i]+", ");
		}
		
		for(int i = 0; i < arr.length ; i++){
			for(int j = i+1; j< arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
					maj = arr[i];
				}
			}
		}
		
		if(count >= (n/2)){
			System.out.println("\nThe majority element is :- "+maj+" "+count);
		}
	}

}