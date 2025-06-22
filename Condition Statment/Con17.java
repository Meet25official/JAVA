//17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.

public class Con17{
	public static void main(String[] args){
		for(int i = 1; i<=5 ; i++){
			for(int j = 1 ; j<=i ; j++){
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}