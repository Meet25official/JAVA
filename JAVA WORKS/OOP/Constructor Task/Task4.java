// 4. Copy Constructor:
//    Create a 'Student' class with fields 'name', 'rollNumber', and 'grade'. Implement a copy constructor that initializes a new object as a copy of an existing 'Student' object. Also, provide a method to display the student's details.

class Student {
    private String name;
    private int rollNumber;
    private char grade;

    public Student(){
        name = null;
        rollNumber = 0;
        grade = ' ';
    }

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public Student(Student other) {
        this.name = other.name;
        this.rollNumber = other.rollNumber;
        this.grade = other.grade;
    }

    void getStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class Task4 {
    public static void main(String[] args) {
        Student student1 = new Student("Meet", 05, 'A');
        Student student2 = new Student(student1); 
        System.out.println("Details of student1:");
        student1.getStudentDetails();
        
        System.out.println("\nDetails of student2 (copy of student1):");
        student2.getStudentDetails();
    }
}
