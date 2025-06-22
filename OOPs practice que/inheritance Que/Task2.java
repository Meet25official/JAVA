//Scenario 2: Employee Hierarchy
//Create an employee hierarchy with a base class called "Employee" and derived classes like "Manager," "Engineer," and "Intern." The base class can contain attributes like name and employee ID, while the derived classes can have additional attributes specific to their roles.

class Employee{
    private String name;
    private int eid;

    public Employee(String name , int eid){
        this.name = name ;
        this.eid = eid;
    }
    public void display(){
        System.out.println("The name of this employee is :- "+name);
        System.out.println("The employee id of this employee is :- "+eid);
    }
}

class Manager extends Employee{
    private String qulification;
    private String post;

    public Manager(String name , int eid , String qulification , String post){
        super(name, eid);
        this.qulification = qulification;
        this.post = post;
    }

    public void displayManager(){
        super.display();
        System.out.println("The qulification of the manager is :- "+qulification);
        System.out.println("The post of the manager is :- "+post);
    }
}

class Engineer extends Employee{
    private double salary;
    private String branch;

    public Engineer(String name , int eid , double salary , String branch){
        super(name, eid);
        this.salary = salary;
        this.branch = branch;
    }

    public void displayEngineer(){
        super.display();
        System.out.println("The salary of the manager is :- "+salary);
        System.out.println("The branch of the manager is :- "+branch);
    }
}
public class Task2 {
    public static void main(String[] args) {
        Manager obj1 = new Manager("Himesh" , 123 , "M.TECH CSE" , "HR");
        Engineer obj2 = new Engineer("Meet" , 230 , 20000 , "Computer Engineering");

        obj1.displayManager();
        obj2.displayEngineer();
    }    
}