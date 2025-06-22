//39. Write a Java program to print all the LEADERS in the array.  

public class Arr39 {
    public static void main(String[] args) {
        int arr[] = {3,6,4,2,5};
        boolean flag = true;
        System.out.println("The Leaders element is :- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.print(arr[i]+", ");
            }
        }
        System.out.print(arr[arr.length - 1]);
    }
}
