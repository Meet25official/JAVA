//12. Write a Java program to find duplicate values in an array of integer values.

import java.util.Scanner;
public class Arr12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,34,74,27,89,59,34,20,18,59};
		System.out.println("The common elements of this arrays is :- ");
		for(int i = 0; i < arr.length ; i++){
			for(int j = 0; j < arr.length ; j++){
				if(j != i){
					if(arr[i] == arr[j]){
						System.out.println(arr[i]);
					}
				}
			}
		}
		sc.close();
	}

}