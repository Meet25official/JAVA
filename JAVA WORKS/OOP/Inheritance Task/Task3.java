// 3. Hierarchical Inheritance Problem:
//    - Problem Statement: Implement a hierarchical inheritance setup with a base class 'Person' and two derived classes 'Student' and 'Teacher'. The 'Person' class should have attributes 'name' and 'age', and a method 'introduce()'. The 'Student' class should add an attribute 'grade', while the 'Teacher' class should add 'subject'. Both derived classes should override 'introduce()' to include their specific details. Utilize constructors and the 'super' keyword appropriately.

class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int grade;
    
    public Student(String name, int age, int grade) {
        super(name, age); 
        this.grade = grade;
    }
    
    public void introduce() {
        super.introduce(); 
        System.out.println("Grade: " + grade);
    }
}

class Teacher extends Person {
    private String subject;
    
    public Teacher(String name, int age, String subject) {
        super(name, age); 
        this.subject = subject;
    }
    
    public void introduce() {
        super.introduce(); 
        System.out.println("Subject: " + subject);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Meet", 17, 12);
        Teacher teacher = new Teacher("Mr. Shrey", 21, "Mathematics");
            
        System.out.println("Student:");
        student.introduce();
            
        System.out.println("\nTeacher:");
        teacher.introduce();
    }
}
