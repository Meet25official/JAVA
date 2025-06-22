//18. Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.

public class Con18{
	public static void main(String[] args){
		int k =1;
		for(int i = 1; i<=4 ; i++){
			for(int j = 1 ; j<=i ; j++){
				System.out.print(k+" ");
				k++;
			}
			System.out.print("\n");
		}
	}
}