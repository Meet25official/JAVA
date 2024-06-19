// Import the necessary Java utilities package.
import java.util.Arrays;

//17. Write a Java program to find the second largest element in an array.

public class Task17 {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original numeric array : " + Arrays.toString(my_array));
        Arrays.sort(my_array);
        int i = my_array.length - 1;
        while (my_array[i] == my_array[my_array.length - 1]) {
            i--;
        }
        System.out.println("Second largest value: " + my_array[i]);
    }
}
