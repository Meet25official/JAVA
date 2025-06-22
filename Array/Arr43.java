//43. Write a Java program to find all combinations of four elements of an array whose sum is equal to a given value.  

public class Arr43 {
    public static void main(String[] args) {
        int arr[] = {10, 2, 10, 2, -1, -4};
        int target = 15;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                for(int k = j+1; k<arr.length ; k++){
                    for(int l = k+1 ; l<arr.length ; l++){
                        if((arr[i] + arr[j] + arr[k] + arr[l]) == target){
                            System.out.println("The two elements of this array is :- "+arr[i]+" , "+arr[j]+", "+arr[k]+", "+arr[l]);
                        }
                    }
                }
            }
        }
    }
}
