//4. Write a Java program to calculate the average value of array elements.

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        int average = sum / array.length;
        System.out.println("Average of array elements: " + average);
    }
}
