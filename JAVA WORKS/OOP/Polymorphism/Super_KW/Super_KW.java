// Super Keyword is used to refer immediate parent class.

// -> instance variable
// -> method
// -> constructor

// Problem Statement: Employee Information System

// Create a system to manage employee information using Java classes and inheritance. Implement a `Person` class that stores basic personal details and an `Emp` class that extends the `Person` class to include salary information.

// The `Person` class contains:
// - Properties: `id` (integer), `name` (String)
// - Constructor: Initializes `id` and `name`

// The `Emp` class inherits from `Person` and adds:
// - Property: `salary` (float)
// - Constructor: Initializes `id`, `name`, and `salary`

// Implement the `display()` method in the `Emp` class to print the employee's information: ID, name, and salary.

// In the `TestSuper5` class:
// - Create an instance of `Emp` with ID `1`, name `"ankit"`, and a salary of `45000`.
// - Display the details of this employee using the `display()` method.



class Person {
    int id;
    String name;

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class Emp extends Person {
    private double salary;

    public Emp(String name, int id, double salary){
        super(id, name);
        this.salary = salary;
    }

    public void display(){
        System.out.println("Name: " + name + "ID" + id + "Salary" + salary);
    }
}
public class Super_KW {
    public static void main(String[] args) {
        Emp e = new Emp("Dhruv", 001, 500000);
        e.display();
    }
}
