//18. Write a Java program to find the second smallest element in an array.

import java.util.Arrays;
public class Task18 {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original numeric array : " + Arrays.toString(my_array));
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] == min) {
                second_min = min;
            } else if (my_array[i] < min) {
                second_min = min;
                min = my_array[i];
            } else if (my_array[i] < second_min) {
                second_min = my_array[i];
            }
        }
        System.out.println("Second lowest number is : " + second_min);
    }
}
