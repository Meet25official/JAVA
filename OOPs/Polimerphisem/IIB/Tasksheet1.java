//Scenario 1: Employee Database
//In an employee database system, create a class called "Employee" with an instance initializer block that initializes a static database connection. The block runs whenever an object of the "Employee" class is created.

class Employee{
    private String name;
    private int eid;
    private double salary;

    {
        name = "Himesh";
        eid = 50;
        salary = 20000;
    }
    
    public void displayDetails(){
        System.out.println("The name of employee is :- "+name);
        System.out.println("The employee id of this employee is :- "+eid);
        System.out.println("The salary of employee is :- "+salary);
    } 
}

public class Tasksheet1 {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.displayDetails();
    }
}
