//16. Write a Java program to display the pattern like a right angle triangle with a number.

//Test Data
//Input number of rows : 10
//Expected Output :

//1                                                                                
//12                                                                               
//123                                                                              
//1234                                                                             
//12345                                                                            
//123456                                                                           
//1234567                                                                          
//12345678                                                                         
//123456789                                                                        
//12345678910

import java.util.Scanner;
public class Task16{
	public static void main(String[] args){
		int i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n = s.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}