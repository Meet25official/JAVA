//35. Write a Java program to find the sum of the two elements of a given array equal to a given integer.

public class Arr35 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 6;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if(i != j){
                   if((arr[i] + arr[j]) == target){
                        System.out.println("The two elements of this array is :- "+arr[i]+" , "+arr[j]);
                    }
                }
            }
        }
    }
}