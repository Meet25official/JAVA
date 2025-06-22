//3. Hierarchical Inheritance Problem:
// - Problem Statement: Implement a hierarchical inheritance setup with a base class 'Person' and two derived classes 'Student' and 'Teacher'. The 'Person' class should have attributes 'name' and 'age', and a method 'introduce()'. The 'Student' class should add an attribute 'grade', while the 'Teacher' class should add 'subject'. Both derived classes should override 'introduce()' to include their specific details. Utilize constructors and the 'super' keyword appropriately.

class Person{
    private String name;
    private int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.println("The name of this person is :- "+name);
        System.out.println("The age of the person is :- "+age);
    }
}

class Student extends Person{
    private String grade;

    Student(String n , int a , String g){
        super(n, a);
        grade = g;
    }

    public void studentIntro(){
        super.introduce();
        System.out.println("The grade of the student is :- "+grade);
    }
}

class Teacher extends Person{
    private String subject;

    Teacher(String n , int a , String s){
        super(n, a);
        subject = s;
    }

    public void teacherIntro(){
        super.introduce();
        System.out.println("The subject  of the teacher is :- "+subject);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Student obj = new Student("Himesh", 18, "AA");
        obj.studentIntro();

        Teacher obj2 = new Teacher("Meet", 23, "JAVA");
        obj2.teacherIntro();
    }
}