//44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
//Sample Output:

//Input number: 5                                                        
//5 + 55  + 555

import java.util.Scanner;
public class Task44{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = s.nextInt(); 
        int nn = n * 11; 
        int nnn = n * 111;  
        int result = n + nn + nnn;
        System.out.println(n + " + " + nn + " + " + nnn + " = " + result);
    }
}
