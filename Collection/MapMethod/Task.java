/*
Task:
Problem Title: Calculate Average Grades

Problem Description:

You are tasked with writing a program to calculate the average grades of a group of students. The program should take a list of student names and their corresponding grades as input and then compute the average grade for the entire class.

Input:
- A list of student names (strings).
- A list of corresponding grades (floating-point numbers).

Output:
- The average grade for the class (a floating-point number).

Function Signature:

---
public static double calculateAverageGrade(String[] studentNames, double[] studentGrades) {
    // Your code here
    return 0.0; // Placeholder return value
}

// Example usage
String[] studentNames = {"Alice", "Bob", "Charlie", "David"};
double[] studentGrades = {85.5, 92.0, 78.5, 88.0};
double averageGrade = calculateAverageGrade(studentNames, studentGrades);
System.out.println("Average Grade: " + averageGrade);
---

Constraints:
- 1 <= Number of students <= 1000
- Grades are floating-point numbers between 0 and 100.

Note:
- You need to calculate the average grade by summing up all the grades and dividing by the number of students.

Your task is to implement the 'calculate_average_grade' function that computes the average grade for the given list of student names and their grades.

*/

import java.util.HashMap;


public class Task {
    public static double calculateAverageGrade(double[] studentGrades) {
        double avg = 0.0;
        for(int i =0 ; i< studentGrades.length ; i++){
            avg += studentGrades[i];
        }   
        return avg;
    }
    public static void main(String[] args) {
        HashMap<Double , String> map = new HashMap<Double , String>();

        map.put(85.5 , "Alice");
        map.put(92.0 , "Bob");
        map.put(78.5 , "Charlie");
        map.put(88.0 , "David");
        // System.out.println(map.());
        // double arr = map.keySet();
        // double average1 = calculateAverageGrade(map.keySet());



    }
}
