//16. Write a Java program to remove duplicate elements from an array. 


public class Arr16{
	public static void main(String[] args){
		int arr[] = {2,34,74,27,89,59,34,20,18,59};
		System.out.println("The common elements of this arrays is :- ");
		for(int i = 0; i < arr.length ; i++){
			for(int j = 0; j < arr.length ; j++){
				if(j != i){
					if(arr[i] == arr[j]){
						for(int k = i;k < arr.length - 1; k++){
							arr[k] = arr[k+1];
						}
					}
				}
			}
		}
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i]+", ");
		}
	}

}