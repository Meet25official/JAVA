// Scenario 3: University Management System
// In a university management system, use the "protected" access modifier for class members that need to be accessed by derived classes, such as a "Student" class accessing the "name" attribute in the "Person" class.

class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private String studentId;
    private String major;
    
    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void printStudentDetails() {
        System.out.println("Student Name: " + name);  
        System.out.println("Age: " + age);            
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}
public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Meet", 21, "100075", "Computer Science");
        student.printStudentDetails();
    }
}
