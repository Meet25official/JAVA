import java.util.Scanner;
public class Arr{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("If you entered an element in the array then input the array :- ");
        Scanner sc = new Scanner(System.in);
        int el = sc.nextInt();  
        sc.close();  
        arr[arr.length] = el;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}