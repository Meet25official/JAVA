// Scenario 7: University Management System
// Create an abstract class called "Person" with abstract methods like "registerCourse" and "submitAssignment." Implement derived classes like "Student" and "Professor" that provide specific implementations for these abstract methods.

abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void registerCourse(String courseName);
    abstract void submitAssignment(String assignment);

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Student extends Person {
    public Student(String name, int id) {
        super(name, id);
    }

    @Override
    void registerCourse(String courseName) {
        System.out.println("Student " + getName() + " (ID: " + getId() + ") registered for course: " + courseName);
    }

    @Override
    void submitAssignment(String assignment) {
        System.out.println("Student " + getName() + " (ID: " + getId() + ") submitted assignment: " + assignment);
    }
}

class Professor extends Person {
    public Professor(String name, int id) {
        super(name, id);
    }

    @Override
    void registerCourse(String courseName) {
        System.out.println("Professor " + getName() + " (ID: " + getId() + ") registered to teach course: " + courseName);
    }

    @Override
    void submitAssignment(String assignment) {
        System.out.println("Professor " + getName() + " (ID: " + getId() + ") graded assignment: " + assignment);
    }
}
public class Task7 {
    public static void main(String[] args) {
        Person student = new Student("bob", 12345);
        student.registerCourse("Computer Science 101");
        student.submitAssignment("Assignment 1");

        Person professor = new Professor("jack", 67890);
        professor.registerCourse("Computer Science 101");
        professor.submitAssignment("Assignment 1");
    }
}
