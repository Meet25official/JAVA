//69. Write a Java program to find the minimum subarray sum of specified size in a given array of integers.  

public class Arr69 {
   public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int target = 4;
        int sum = 0;
        for (int i = 0; i < target; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of sub-array is :- "+sum);
   } 
}