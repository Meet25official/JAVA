/*
Abstraction : Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Abstract Class: A class with the abstract keyword is called an abstract class. It can have abstract and non-abstract methods.

0%-100% abstraction is possible in abstract class.

Rules for Abstract class:

1. must declare with abstract keyword.
2. it can have abstract and non-abstract methods.
3. it cannot be instantiated.
4. it can have constructors and static methods also.
5. it can have final methods which will force the subclass not to change the body of the method.
*/


//abstract class
abstract class Person {
    String name;
    int age;

    abstract void display();    //no body
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

//concrete class
class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nRoll No: " + rollNo);
    }
}

public class AbstClass {
    public static void main(String[] args) {
        //Anonymous class
        // new Person("name", 23) {
        //     @Override
        //     void display() {
        //         System.out.println("Aonymous class");
        //         System.out.println("Name: " + name + "\nAge: " + age);
        //     }
        // }.display();
        
        Student s = new Student("Dhulo", 18, 419);
        s.display();
    }
}