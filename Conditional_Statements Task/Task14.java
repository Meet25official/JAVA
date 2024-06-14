// 14. Write a Java program to display the multiplication table of a given integer.

// Test Data
// Input the number (Table to be calculated) : Input number of terms : 5
// Expected Output :

// 5 X 0 = 0                                                                        
// 5 X 1 = 5                                                                        
// 5 X 2 = 10                                                                       
// 5 X 3 = 15                                                                       
// 5 X 4 = 20                                                                       
// 5 X 5 = 25

import java.util.Scanner;
public class Task14{
    public static void main(String[] args){
        int j,n;
        System.out.print("Input the number(Table to be calculated): ");
        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
	    n = in.nextInt();
        System.out.println ("\n");
        for(j=0;j<=n;j++){
            System.out.println(n+" X "+j+" = " +n*j);
        }
    }
}
