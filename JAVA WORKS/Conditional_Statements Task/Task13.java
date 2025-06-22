// 13. Write a Java program to display the cube of the given number up to an integer.

// Test Data
// Input number of terms : 4
// Expected Output :

// Number is : 1 and cube of 1 is : 1                                               
// Number is : 2 and cube of 2 is : 8                                               
// Number is : 3 and cube of 3 is : 27                                              
// Number is : 4 and cube of 4 is : 64

import java.util.Scanner;
public class Task13 {
    public static void main(String[] args){
        int i,n;
        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
		n = in.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
        }
    }
}
