//5. Write a Java program to test if an array contains a specific value.

public class Task5{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int target = 4;
        boolean found = false;
        for (int num : array) {
            if (num == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Array contains the value " + target);
        } else {
            System.out.println("Array does not contain the value " + target);
        }
    }
}

