//5. Write a Java program to test if an array contains a specific value.  

import java.util.Scanner;
public class Arr5{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int arr[] = {2,34,74,27,89,48,20,18,59};
			System.out.println("Enter the any target if you finding :- ");
			int target = sc.nextInt();
			for(int i = 0; i < arr.length ; i++){
				if(target == arr[i]){
					System.out.println("The target is find.");
				}
				else{
					System.out.println("The target is not find.");
					break;
				}
			}
			sc.close();

	}

}