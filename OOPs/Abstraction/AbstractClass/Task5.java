//Scenario 5: Employee Management
//Design an abstract class called "Employee" with abstract methods like "calculateSalary" and "displayDetails." Implement derived classes like "Manager" and "Engineer" that provide specific implementations for these abstract methods.

abstract class Employee{
    private int eid;
    private String name;
    private double salary;

    public Employee(int eid , String name , double salary){
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    abstract void calculateSalary();
    abstract void displayDetails();

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}

class Manager extends Employee{
    private String posting;

    public Manager(int eid , String name , double salary , String posting){
        super(eid, name, salary);
        this.posting = posting;
    }

    @Override
    public void calculateSalary(){
        System.out.println("The monthely salary of this Employee is :- "+super.getSalary());
        System.out.println("The Yearly salary of this Employee is :- "+super.getSalary()*12);
    }

    @Override
    public void displayDetails(){
        System.out.println("The employee id is :- "+super.getEid());
        System.out.println("The employee name is :- "+super.getName());
        System.out.println("The Posting of this Manager is :- "+posting);
    }
}

class Engineer extends Employee{
    private String qulification;

    public Engineer(int eid , String name , double salary , String qulification){
        super(eid, name, salary);
        this.qulification = qulification;
    }

    @Override
    public void calculateSalary(){
        System.out.println("The monthely salary of this Employee is :- "+super.getSalary());
        System.out.println("The Yearly salary of this Employee is :- "+super.getSalary()*12);
    }

    @Override
    public void displayDetails(){
        System.out.println("The employee id is :- "+super.getEid());
        System.out.println("The employee name is :- "+super.getName());
        System.out.println("The Qulification of this Engineer is :- "+qulification);
    }
}
public class Task5 {
    public static void main(String[] args) {
        Manager obj1 = new Manager(123, "Himesh", 100000, "HR");
        Engineer obj2 = new Engineer(456, "Dhruv", 140000,"M.TECH Bombay");
        obj1.calculateSalary();
        obj1.displayDetails();
        obj2.calculateSalary();
        obj2.displayDetails();
    }
}