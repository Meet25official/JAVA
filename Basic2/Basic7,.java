//7. Write a Java program that takes a number as input and prints its multiplication table up to 10.


import java.util.Scanner;
public class Basic7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :- ");
		int n1 = sc.nextInt();
		for(int i=1 ; i<=10 ; i++){
			System.out.println(n1+"*"+i+"="+n1*i);
		}
	}
}