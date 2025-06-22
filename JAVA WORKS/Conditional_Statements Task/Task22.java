// 22. Write a Java program to display Pascal's triangle.

// Test Data
// Input number of rows: 5
// Expected Output :

// Input number of rows: 5                                                          
//       1                                                                          
//      1 1                                                                         
//     1 2 1                                                                        
//    1 3 3 1                                                                       
//   1 4 6 4 1  

import java.util.Scanner;
public class Task22 {

  public static void main(String[] args)
{
    int nrow,c=1,blk,i,j;
    System.out.print("Input number of rows: ");
    Scanner s = new Scanner(System.in);
		    nrow = s.nextInt();
    for(i=0;i<nrow;i++)
    {
        for(blk=1;blk<=nrow-i;blk++)
        System.out.print(" ");
        for(j=0;j<=i;j++)
        {
            if (j==0||i==0)
                c=1;
            else
               c=c*(i-j+1)/j;
            System.out.print(" "+c);
        }
        System.out.print("\n");
    }
}
}
