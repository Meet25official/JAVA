//21. Write a Java program to display the pattern like a diamond.

//Test Data
//Input number of rows (half of the diamond) : 7
//Expected Output :

                                                                                 
//      *                                                                          
//     ***                                                                         
//    *****                                                                        
//   *******                                                                       
//  *********                                                                      
// ***********                                                                     
//*************                                                                    
// ***********                                                                     
//  *********                                                                      
//   *******                                                                       
//    *****                                                                        
//     ***                                                                         
//      *  


import java.util.Scanner;
public class Task21 {
	public static void main(String[] args){
		int i,j,r;
		System.out.print("Input number of rows (half of the diamond) : ");
		Scanner s = new Scanner(System.in);
		r = s.nextInt();
		for(i=0;i<=r;i++){
			for(j=1;j<=r-i;j++)
			System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
				System.out.print("\n");
		}
 
		for(i=r-1;i>=1;i--){
			for(j=1;j<=r-i;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
				System.out.print("\n");
		}
 
	}
}
