//4. Copy Constructor:
// Create a 'Student' class with fields 'name', 'rollNumber', and 'grade'. Implement a copy constructor that initializes a new object as a copy of an existing 'Student' object. Also, provide a method to display the student's details.

class Student{
    private String name , grade;
    private int rollNumber;

    public Student(String name , String grade , int rollNumber){
        this.name = name;
        this.grade = grade;
        this.rollNumber = rollNumber;
    }
    public Student(Student obj){
        this.name = obj.name;
        this.grade = obj.grade;
        this.rollNumber = obj.rollNumber;
    }

    void display(){
        System.out.println("The name of student is :- "+name);
        System.out.println("The grade of student is :- "+grade);
        System.out.println("The roll no of student is :- "+rollNumber);
    }

}

public class Task4 {
    public static void main(String[] args) {
        Student obj2 = new Student("Himesh" , "A1" , 50);
        Student obj3 = new Student(obj2);
        obj2.display();
        obj3.display();
    }
}
