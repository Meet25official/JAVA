//23. Write a Java program to test two arrays' equality.


public class Arr23{
	public static void main(String[] args){
		int arr[][] = {{2,34},{74,27}};
		int arr2[][] = {{2,34},{34,30}};
		System.out.println("The common elements of this two arrays is :- ");
		for(int i = 0; i < arr.length ; i++){
			for(int j = 0; j < arr.length ; j++){
				for(int k = 0; k< arr.length ; k++){
					if(arr[i][k] == arr2[k][j]){
						System.out.println(arr2[i][j]);
					}
				}
			}
		}
	}

}