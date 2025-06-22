//Scenario 7: University Management System
//Create an abstract class called "Person" with abstract methods like "registerCourse" and "submitAssignment." Implement derived classes like "Student" and "Professor" that provide specific implementations for these abstract methods.

abstract class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void registerCourse();
    abstract void submitAssignment();
}

class Student extends Person{
    private int sid;
    private String cname;

    public Student(String name , int sid , String cname){
        super(name);
        this.sid = sid;
        this.cname = cname;
    }

    @Override
    public void registerCourse(){
        System.out.println("The Student name is :- "+super.getName());
        System.out.println("The Student id is :- "+sid);
        System.out.println("The Cource name of this student is :- "+cname);
    }

    @Override
    public void submitAssignment(){
        System.out.println("The submit date of this assignment is 19th July.");
        System.out.println("Your submission is completed.");   
    }
}

class Professor extends Person{
    private int pid;
    private String cname;

    public Professor(String name , int pid , String cname){
        super(name);
        this.pid = pid;
        this.cname = cname;
    }

    @Override
    public void registerCourse(){
        System.out.println("The Professor name is :- "+super.getName());
        System.out.println("The Professor id is :- "+pid);
        System.out.println("The Cource name of Professor is :- "+cname);
    }

    @Override
    public void submitAssignment(){
        System.out.println("Professor Asked submission start :- "); 
    }
}
public class Task7 {
    public static void main(String[] args) {
        Student obj1 = new Student("Himesh", 123, "Maths");
        Professor obj2 = new Professor("Shrey", 450, "Java");

        obj1.registerCourse();
        obj1.submitAssignment();

        obj2.registerCourse();
        obj2.submitAssignment();
    }
}
