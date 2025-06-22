// Scenario 5: Employee Management
// Design an abstract class called "Employee" with abstract methods like "calculateSalary" and "displayDetails." Implement derived classes like "Manager" and "Engineer" that provide specific implementations for these abstract methods.

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
    abstract void displayDetails();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + getName());
        System.out.println("Manager ID: " + getId());
        System.out.println("Manager Salary: " + calculateSalary());
    }
}

class Engineer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Engineer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayDetails() {
        System.out.println("Engineer Name: " + getName());
        System.out.println("Engineer ID: " + getId());
        System.out.println("Engineer Salary: " + calculateSalary());
    }
}
public class Task5 {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 80000, 20000);
        manager.displayDetails();

        Employee engineer = new Engineer("Bob", 102, 50, 160);
        engineer.displayDetails();
    }
}
