/*
Problem Statement: Employee Information System

Create a system to manage employee information using Java classes and inheritance. Implement a `Person` class that stores basic personal details and an `Emp` class that extends the `Person` class to include salary information.

The `Person` class contains:
- Properties: `id` (integer), `name` (String)
- Constructor: Initializes `id` and `name`

The `Emp` class inherits from `Person` and adds:
- Property: `salary` (float)
- Constructor: Initializes `id`, `name`, and `salary`

Implement the `display()` method in the `Emp` class to print the employee's information: ID, name, and salary.

In the `TestSuper5` class:
- Create an instance of `Emp` with ID `1`, name `"ankit"`, and a salary of `45000`.
- Display the details of this employee using the `display()` method.
*/

class Person{
    private int id;
    private String name;
    
    public Person(int id , String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("The id of this Employee is :- "+id);
        System.out.println("The name of this Employee is :- "+ name);
    }
}

class Emp extends Person{
    private double salary;

    public Emp(int id, String name , double salary){
        super(id, name);
        this.salary = salary;
    }

    void displayEmployee(){
        super.display();
        System.out.println("The salary of this Employee is :- "+salary);
    }
}

public class SuperTask {
    public static void main(String[] args) {
        Emp obj = new Emp(1, "Ankit", 45000);
        obj.displayEmployee();
    }
}