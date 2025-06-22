//Scenario 1: Student Grades
// In a school grading system, create an array to store the grades of students in a class. Perform operations such as calculating the average grade, finding the highest and lowest grades, and identifying students who scored above a certain threshold.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {70,59,68,44,98,93,84,64,51,89};
        int max = 0;
        int min = arr[0];
        int sum = 0;
        System.out.println("Enter the any target if you get :- ");
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("The avareage grade of this student is :- "+((sum)/arr.length));
        System.out.println("The maximum grad of this student grade array is :- "+max);
        System.out.println("The minimum grad of this student grade array is :- "+min);
        System.out.println("Who those student get "+target+" or above marks is display below :- ");
        for(int i = 0; i < arr.length; i++){
           if (arr[i] >= target) {
                System.out.println(arr[i]);
           } 
        }
        sc.close();
    }
}