//14. Write a Java program to find common elements between two arrays (string values).

import java.util.Arrays;
public class Task14 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 3, 2, 6, 8};
        int[] array2 = {1, 0, 6, 10, 4, 7, 0, 4};
        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == (array2[j])) {
                    System.out.println("Common element is : " + (array1[i]));
                }
            }
        }
    }
}

