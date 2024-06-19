//20. Write a Java program to convert an array to an ArrayList.

import java.util.Arrays;
import java.util.Scanner;
public class Task19{
    public static void main(String[] args){
        String[] s = {"abc", "xyz", "wxy"};
        List al = Arrays.asList(s);
        System.out.println(al);
    }
}
