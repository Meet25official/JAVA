//10. Write a Java program to find the maximum and minimum value of an array.

import java.util.Arrays;
class Task10{
    public static void main(String[] args) {
        int a[]={1,423,6,46,34,23,13,53,4}; 
        Arrays.sort(a);
        System.out.println("The minimum value: " + a[0] + "\nThe maximum value: " + a[a.length-1]);
    }
}