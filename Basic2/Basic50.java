//50. Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.


public class Basic50{
	public static void main(String[] args){
		for(int i=1 ; i<=100 ; i++){
			if(i%3 == 0){
				System.out.println("Divided By 3: "+i+", ");
			}
		}
		for(int i=1 ; i<=100 ; i++){
			if(i%5 == 0){
				System.out.println("Divided By 5: "+i+", ");
			}
		}			
		for(int i=1 ; i<=100 ; i++){
			if(i%3 == 0 && i%5 == 0){
				System.out.println("Divided By 3&5: "+i+", ");
			}
		}
	}
}