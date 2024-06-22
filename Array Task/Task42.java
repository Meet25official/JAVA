// 42. Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides.  


public class Task42 {
    public static void main(String[] args) {
        int array[] = {1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0};
        for(int i = 0; i < array.length; i++){
            for(int j =i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Array after the Separate: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ ",");
        }
    }
}
