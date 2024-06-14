// 11. Write a Java program to display n terms of natural numbers and their sum.

// Test Data
// Input the number: 2
// Expected Output :

// Input number:                                                                    
// 2                                                                                
// The first n natural numbers are :                                                
// 2                                                                                
// 1                                                                                
// 2                                                                                
// The Sum of Natural Number upto n terms :                                         
// 23

import java.util.Scanner;
public class Task11 {
    public static void main(String[] args){
        int i, n, sum=0;
        Scanner in = new Scanner(System.in);  
        System.out.print("Input number: ");  
        n = in.nextInt();
        System.out.println("The first n natural numbers are : "+n);
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);
    }
}
