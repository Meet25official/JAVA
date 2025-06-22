/*
--> Problem Statement 2: Student Grades Aggregation

Context:
You are developing a system for a school to manage students' grades. Each student can be enrolled in multiple courses, and each course has multiple grades recorded for the student. Your task is to write a Java program that aggregates the grades data to provide insights such as total grades, average grade, and highest grade for each student.

Requirements:
1. Create a `Course` class that contains a list of `Grade` objects. Each `Grade` object should have attributes such as `date` (of type `LocalDate`) and `score` (of type `double`).
2. Write methods in the `Course` class to:
   - Calculate the total grades for the course.
   - Calculate the average grade for the course.
   - Find the highest grade for the course.
3. Create a `Student` class that contains a list of `Course` objects.
4. Write methods in the `Student` class to:
   - Calculate the total grades for the student across all courses.
   - Calculate the average grade for the student across all courses.
   - Find the course with the highest average grade.

Example Usage:

Course math = new Course();
math.addGrade(new Grade(LocalDate.of(2023, 1, 1), 90.0));
math.addGrade(new Grade(LocalDate.of(2023, 1, 2), 85.0));

Course science = new Course();
science.addGrade(new Grade(LocalDate.of(2023, 1, 1), 95.0));
science.addGrade(new Grade(LocalDate.of(2023, 1, 2), 80.0));

Student student = new Student();
student.addCourse(math);
student.addCourse(science);

System.out.println("Total grades for the student: " + student.getTotalGrades());
System.out.println("Average grade for the student: " + student.getAverageGrade());
System.out.println("Course with the highest average grade: " + student.getTopCourse().getAverageGrade());
*/

import java.time.LocalDate;

class Grade{
    private LocalDate date;
    public double score;

    public Grade(LocalDate date ,double score){
        this.date = date;
        this.score = score;
    }
}

class Course{
    private Grade[] grade;
    private int capacity;
    private int count;
    public Course(){}
    public Course(int capacity){
        this.capacity = capacity;
        grade = new Grade[this.capacity];
        count = 0;
    }

    public void addGrade(Grade grade1){
        if(count <= capacity){
            grade[count] = grade1;
            count++;
        }
        else{
            System.out.println("The Capacity is full!!!");
        }
    }

    public double getTotalGrade(){
        double tg = 0;
        for (int i = 0; i < count; i++) {
            tg += grade[i].score;
        } 
        return tg;
    }

    public double getAverageGrade(){
        double avg = getTotalGrade()/count;
        return avg;
    }

    public double getTopGrade(){
        double max = 0;
        for (int i = 0; i < count; i++) {
            if(max < grade[i].score){
                max = grade[i].score;
            }
        }
        return max;
    }
}

class Student{
    public Course[] course;
    private int capacity;
    private int count;

    public Student(int capacity){
        this.capacity = capacity;
        course = new Course[this.capacity];
        count = 0;
    }

    public void addCourse(Course course1){
        if(count <= capacity){
            course[count] = course1;
            count++; 
        }
        else{
            System.out.println("The capacity is full!!!");
        }
    }

    public double getTotalGrade1(){
        double tt = 0;
        for (int i = 0; i < count; i++) {
            tt +=  course[i].getTotalGrade();
        }
        return tt;
    }

    public double getAverageGrade1(){
        double avg = 0;
        for (int i = 0; i < count; i++) {
            avg += course[i].getAverageGrade();
        }
        return avg/count;
    }

    // public double getTopCourse(){
    //     double sum1 = 0;
    //     double sum2 = 0;
    //     for (int i = 0; i < count; i++) {
    //         for (int j = 0; j < count; j++) {
    //             if(i != j){
    //                 if(){}
    //             }
    //         }
    //     }
    // }
}

public class Task2 {
    public static void main(String[] args) {
        Course math = new Course(10);
            math.addGrade(new Grade(LocalDate.of(2023, 1, 1),87.0));
            math.addGrade(new Grade(LocalDate.of(2023, 1, 1),97.0));

        Course science = new Course(10);
            science.addGrade(new Grade(LocalDate.of(2023, 1, 1),86.0));
            science.addGrade(new Grade(LocalDate.of(2023, 1, 1),93.0));
    
        Student himesh = new Student(10);
            himesh.addCourse(math);
            himesh.addCourse(science);
            System.out.println("Total grades for the student: " + himesh.getTotalGrade1());
            System.out.println("Average grade for the student: " + himesh.getAverageGrade1());
            // System.out.println("Course with the highest average grade: " + student.getTopCourse().getAverageGrade());
            
    }    
}