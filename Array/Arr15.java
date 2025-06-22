//15. Write a Java program to find common elements between two integer arrays.


public class Arr15{
	public static void main(String[] args){
		int arr[] = {2,34,74,27,89,48,20,18,59};
		int arr2[] = {12,45,34,30,49,59,37,89,10,48};
		System.out.println("The common elements of this two arrays is :- ");
		for(int i = 0; i < arr.length ; i++){
			for(int j = 0; j < arr2.length ; j++){
				if(arr[i] == arr2[j]){
					System.out.println(arr2[j]);
				}
			}
		}
	}

}