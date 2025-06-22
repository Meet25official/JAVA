//Scenario 3: University Management System
//In a university management system, use the "protected" access modifier for class members that need to be accessed by derived classes, such as a "Student" class accessing the "name" attribute in the "Person" class.

class University{
    protected String name;
    protected int sid;
}

class Student extends University{
    public Student(String name , int sid){
        this.name = name;
        this.sid = sid;
    }

    public void dispaly(){
        System.out.println("The name of this student is :- "+name);
        System.out.println("The Student number is :- "+sid);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Student obj = new Student("Himesh" , 50);
        obj.dispaly();

    }
}