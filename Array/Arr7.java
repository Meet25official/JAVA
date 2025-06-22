//7. Write a Java program to remove a specific element from an array.


import java.util.Scanner;
public class Arr7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,34,74,27,89,48,20,18,59};
		System.out.println("Enter the element of the array :- ");
		int target = sc.nextInt();
		
		System.out.println("The array before remove the element :- ");
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i]+", ");
		}
		
		for(int i = 0; i < arr.length ; i++){
			if(target == arr[i]){
				for(int j = i ; j<arr.length -1 ; j++){
					arr[j] = arr[j+1];
				}
			}
		}
		
		System.out.println("The array after remove the element :- ");
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i]+", ");
		}
		sc.close();
	}

}