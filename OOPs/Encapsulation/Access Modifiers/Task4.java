//Scenario 4: Employee Database
//In an employee database application, use the "default" (package-private) access modifier for methods and attributes that should only be accessible within the same package, such as utility methods or helper classes.

class Employee{
    String name;
    int eid;
    double salary;

    Employee(String name , int eid , double salary){
        this.name = name;
        this.eid = eid;
        this.salary = salary;
    }

    void display(){
        System.out.println("The name of this employee is :- "+name);
        System.out.println("The employee id is :- "+eid);
        System.out.println("The salary of this employee :- "+salary);
    }
}

public class Task4 {
    public static void main(String[] args) {
        Employee obj = new Employee("Himesh Patel", 123, 89000);
        // System.out.println(obj.name);
        // System.out.println(obj.eid);
        // System.out.println(obj.salary);
        obj.display();
    }     
}