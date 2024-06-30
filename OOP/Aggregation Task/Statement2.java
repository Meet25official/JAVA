// --> Problem Statement 2: Student Grades Aggregation

// Context:
// You are developing a system for a school to manage students' grades. Each student can be enrolled in multiple courses, and each course has multiple grades recorded for the student. Your task is to write a Java program that aggregates the grades data to provide insights such as total grades, average grade, and highest grade for each student.

// Requirements:
// 1. Create a `Course` class that contains a list of `Grade` objects. Each `Grade` object should have attributes such as `date` (of type `LocalDate`) and `score` (of type `double`).
// 2. Write methods in the `Course` class to:
//    - Calculate the total grades for the course.
//    - Calculate the average grade for the course.
//    - Find the highest grade for the course.
// 3. Create a `Student` class that contains a list of `Course` objects.
// 4. Write methods in the `Student` class to:
//    - Calculate the total grades for the student across all courses.
//    - Calculate the average grade for the student across all courses.
//    - Find the course with the highest average grade.

// Example Usage:

// Course math = new Course();
// math.addGrade(new Grade(LocalDate.of(2023, 1, 1), 90.0));
// math.addGrade(new Grade(LocalDate.of(2023, 1, 2), 85.0));

// Course science = new Course();
// science.addGrade(new Grade(LocalDate.of(2023, 1, 1), 95.0));
// science.addGrade(new Grade(LocalDate.of(2023, 1, 2), 80.0));

// Student student = new Student();
// student.addCourse(math);
// student.addCourse(science);

// System.out.println("Total grades for the student: " + student.getTotalGrades());
// System.out.println("Average grade for the student: " + student.getAverageGrade());
// System.out.println("Course with the highest average grade: " + student.getTopCourse().getAverageGrade());

import java.time.LocalDate;

class Grade {
    private LocalDate date;
    private double score;

    public Grade(LocalDate date, double score) {
        this.date = date;
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}

class Course {
    private Grade[] grades;
    private int capacity;
    private int size;

    public Course(int capacity) {
        this.grades = new Grade[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public void addGrade(Grade grade) {
        if (size < capacity) {
            grades[size++] = grade;
        }
    }

    public double getTotalGrades() {
        double total = 0.0;
        for (int i = 0; i < size; i++) {
            total += grades[i].getScore();
        }
        return total;
    }

    public double getAverageGrade() {
        if (size == 0) {
            return 0.0;
        }

        double total = getTotalGrades();
        return total / size;
    }

    public double getHighestGrade() {
        if (size == 0) {
            return 0.0; 
        }

        double maxGrade = grades[0].getScore();
        for (int i = 1; i < size; i++) {
            double currentGrade = grades[i].getScore();
            if (currentGrade > maxGrade) {
                maxGrade = currentGrade;
            }
        }
        return maxGrade;
    }
}

class Student {
    private Course[] courses;
    private int capacity;
    private int size;

    public Student(int capacity) {
        this.courses = new Course[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public void addCourse(Course course) {
        if (size < capacity) {
            courses[size++] = course;
        }
    }

    public double getTotalGrades() {
        double total = 0.0;
        for (int i = 0; i < size; i++) {
            total += courses[i].getTotalGrades();
        }
        return total;
    }

    public double getAverageGrade() {
        if (size == 0) {
            return 0.0;
        }

        double total = getTotalGrades();
        return total / getTotalCourses();
    }

    public Course getTopCourse() {
        if (size == 0) {
            return null;
        }

        Course topCourse = courses[0];
        double maxAverage = topCourse.getAverageGrade();

        for (int i = 1; i < size; i++) {
            double currentAverage = courses[i].getAverageGrade();
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
                topCourse = courses[i];
            }
        }
        return topCourse;
    }

    private int getTotalCourses() {
        return size;
    }
}

public class Statement2 {
    public static void main(String[] args) {
        Grade grade1 = new Grade(LocalDate.of(2023, 1, 1), 90.0);
        Grade grade2 = new Grade(LocalDate.of(2023, 1, 2), 85.0);
        Grade grade3 = new Grade(LocalDate.of(2023, 1, 1), 95.0);
        Grade grade4 = new Grade(LocalDate.of(2023, 1, 2), 80.0);

        Course math = new Course(10);
        math.addGrade(grade1);
        math.addGrade(grade2);

        Course science = new Course(10);
        science.addGrade(grade3);
        science.addGrade(grade4);

        Student student = new Student(10);
        student.addCourse(math);
        student.addCourse(science);

        System.out.println("Total grades for the student: " + student.getTotalGrades());
        System.out.println("Average grade for the student: " + student.getAverageGrade());

        Course topCourse = student.getTopCourse();
        if (topCourse != null) {
            System.out.println("Course with the highest average grade: " + topCourse.getAverageGrade());
        } else {
            System.out.println("No courses found.");
        }
    }
}

