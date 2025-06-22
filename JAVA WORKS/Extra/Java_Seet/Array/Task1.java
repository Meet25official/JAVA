// Scenario 1: Student Grades
// In a school grading system, create an array to store the grades of students in a class. Perform operations such as calculating the average grade, finding the highest and lowest grades, and identifying students who scored above a certain threshold.

public class Task1 {
    public static void main(String[] args) {
        int[] grades = {90, 80, 70, 60, 50};
        int sum = 0;
        int average = 0;
        int highest = 0;
        int lowest = 0;
        int threshold = 60;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            if (grades[i] > highest) {  
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        average = sum / grades.length;
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        System.out.println("Students who scored above " + threshold + ": ");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > threshold) {
                System.out.println("Student " + (i + 1) + " scored " + grades[i]);
            }
        }
    }
}
