//48. Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
//Sample Output:

//1                                                                      
//3                                                                      
//5                                                                      
//7                                                                      
//9                                                                      
//11                                                                     
//....                                                                                                                                       
//91                                                                     
//93                                                                     
//95                                                                     
//97                                                                     
//99 

import java.util.Scanner;

public class Task48{
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
    }
}
