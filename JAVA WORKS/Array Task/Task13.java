//13. Write a Java program to find duplicate values in an array of string values.

public class Task13 {
    public static void main(String[] args) {
        String[] array = {"ab","bc","cd","bc","xy","yz","xy"};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if ((array[i].equals(array[j])) && (i != j)) {
                    System.out.println("Duplicate Element is : " + array[j]);
                }
            }
        }
    }    
}