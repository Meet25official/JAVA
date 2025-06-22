// Scenario 15: Student Management System
// Create a student management system with classes like "Student," "Course," and "Enrollment." Implement methods for adding students, enrolling them in courses, and calculating their grades.

class Person {
    private String name;
    private int id;
    
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

class Student extends Person {
    public Student(String name, int id) {
        super(name, id);
    }
}

class Course {
    private String courseName;
    private int courseCode;
    
    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public int getCourseCode() {
        return courseCode;
    }
    
    public String toString() {
        return "Course Name: " + courseName + ", Course Code: " + courseCode;
    }
}

class Enrollment {
    private Student student;
    private Course course;
    private double grade;
    
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.grade = 0.0; 
    }
    
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public double getGrade() {
        return grade;
    }
    
    public String toString() {
        return student.getName() + " enrolled in " + course.getCourseName() + " with grade: " + grade;
    }
}
public class TAsk15 {
    public static void main(String[] args) {
        Student alice = new Student("Alice", 1);
        Student bob = new Student("Bob", 2);
        
        Course math = new Course("Mathematics", 101);
        Course science = new Course("Science", 102);
        
        Enrollment enrollment1 = new Enrollment(alice, math);
        Enrollment enrollment2 = new Enrollment(bob, science);
        
        enrollment1.setGrade(95.0);
        enrollment2.setGrade(88.0);
        
        System.out.println(enrollment1);
        System.out.println(enrollment2);
    }
}
