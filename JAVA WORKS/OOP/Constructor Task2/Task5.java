// 5. Student Class: Develop a `Student` class with a constructor to store a student's name, ID, and a list of courses they are enrolled in.

class Student {
    private String name;
    private int studentId;
    private String[] courses;
    private int numCourses;  

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new String[10];  
        this.numCourses = 0;
    }

    public void enroll(String course) {
        if (numCourses < courses.length) {
            courses[numCourses] = course;
            numCourses++;
        } else {
            System.out.println("Cannot enroll in more courses. Array is full.");
        }
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Courses Enrolled:");
        for (int i = 0; i < numCourses; i++) {
            System.out.println("- " + courses[i]);
        }
    }
}
public class Task5 {
    public static void main(String[] args) {
        Student student = new Student("Meet", 12345);

        student.enroll("Physics");
        student.enroll("Chemistry");
        student.enroll("Maths");

        student.displayInfo();
    }
}
