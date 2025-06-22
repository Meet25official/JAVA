//34. Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.

import java.util.Arrays;
public class Arr34 {
    public static void main(String[] args) {
        int arr[] = {49, 1, 3, 200, 2, 4, 70, 5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if((arr[i] - arr[j]) == 1){
                    
                }
            }
        }
    }
}

