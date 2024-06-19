//6. Write a Java program to find the index of an array element.


import java.util.Arrays;
public class Task6{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, target);
        if (index >= 0) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
