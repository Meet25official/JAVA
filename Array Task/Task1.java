//1. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;
public class Task1{
	public static void main(String[] args){
		int[] numericArray = {5, 2, 9, 1, 5, 6};
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        String[] stringArray = {"apple", "orange", "banana", "grape"};
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
	}
}


