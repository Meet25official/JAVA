public class Arr36 {
    public static void main(String[] args) {
        int arr[] = {1, -2, 0, 5, -1, -4};
        int target = 5;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                for(int k = j+1; k<arr.length ; k++){
                    if((arr[i] + arr[j] + arr[k]) == target){
                        System.out.println("The two elements of this array is :- "+arr[i]+" , "+arr[j]+", "+arr[k]);
                    }
                }
            }
        }
    }
}
