//Scenario 2: Company Employee Management
//In a company employee management system, create a class called "Employee" with an instance initializer block that initializes an employee's access privileges and permissions when a new employee object is created.

class Employee{
    private String name;
    private String permission;
    private int eid;
    public Employee(String name ,int eid){
        this.name = name;
        this.eid = eid;
    } 

    {
        permission = "Employee Permission";
    }
    void displayDetails(){
        System.out.println("The name of this employee is :- "+name);
        System.out.println("The employee id of this employee is :- "+eid);
        System.out.println("The permision of this employee is :- "+permission);
    }
}

public class TaskSheet3 {
    public static void main(String[] args) {
        Employee obj = new Employee("Himesh", 123);
        obj.displayDetails();
    }
}
