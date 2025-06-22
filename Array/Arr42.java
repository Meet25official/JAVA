//42. Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides.  

public class Arr42 {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,0,1,1,0,0};
        int temp;
        for(int i = 0  ; i <= arr.length ; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("\b ");
    }
}