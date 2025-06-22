//2. Text Processing:
//   Create a search engine algorithm that reads and analyzes a text file, enabling users to input a word or phrase to find all occurrences and their respective positions within the document.
/*
 2. Text Processing:
   - Input Text: "Java is a popular programming language. Java is used for various applications."
     - Search Query: "Java"
     - Expected Output: Positions found at [0, 32]
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String str = "Java is a popular programming language. Java is used for various applications.";
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter the Search Quary :- ");
        String quary = sc.nextLine();
        int index = str.indexOf(quary);
        int i = 0;
        while(index >=0 ){
            arr[i] = index;
            i++;
            index = str.indexOf(quary , index+1);
        }
    
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }
        sc.close();
    }  
}