//19. Write a Java program to add two matrices of the same size.


public class Arr19{
	public static void main(String[] args){
		int arr[][] = {{1,2} , {4,5}};
		int arr2[][] = {{6,7} , {8,9}};
		System.out.println("The first array is :- ");
		for(int i = 0; i< arr.length ; i++){
			for(int j = 0; j< arr.length ; j++){
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
		System.out.println("The second array is :- ");
		for(int i = 0; i< arr.length ; i++){
			for(int j = 0; j< arr.length ; j++){
				System.out.print(arr2[i][j]+" ");	
			}
			System.out.println();
		}
	}
}