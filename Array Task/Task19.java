//19. Write a Java program to add two matrices of the same size.

public class Task19{  
	public static void main(String args[]){    
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};    
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};        
		int c[][]=new int[3][3];      
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=a[i][j]+b[i][j];    
				System.out.print(c[i][j]+"\t");    
			}    
			System.out.println();
		}    
	}
}  
