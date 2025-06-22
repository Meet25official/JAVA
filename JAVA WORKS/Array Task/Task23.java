//23. Write a Java program to test two arrays' equality.

import java.util.Arrays;  
public class Task23
{   
public static void main (String[] args)    
{     
int[] array1 = new int[] {'a', 'b', 'c', 'd', 'e'};   
int[] array2 = new int[] {'a', 'b', 'c', 'd', 'e'};  
if (Arrays.equals(array1, array2))   
System.out.println("Arrays are equal.");   
else  
System.out.println("Arrays are not equal.");   
}   
}  