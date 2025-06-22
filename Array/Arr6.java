//6. Write a Java program to find the index of an array element.


import java.util.Scanner;
public class Arr6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,34,74,27,89,48,20,18,59};
		System.out.println("Enter the element of the array :- ");
		int target = sc.nextInt();
		for(int i = 0; i < arr.length ; i++){
			if(target == arr[i]){
				System.out.println("The index of the element is :- "+i);
			}
		}
		sc.close();
	}

}