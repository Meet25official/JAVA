//7. Employee Class: Implement an `Employee` class with a constructor to store an employee's name, employee ID, and salary.

class Employee{
    private String name;
    private int eid;
    private double salary;

    public Employee(String n, int e , double s){
        name = n;
        eid = e;
        salary = s;
    }

    public void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Employee's Id : " + eid);
        System.out.println("Salary : " + salary);
    }
}

public class Task16 {
   public static void main(String[] args) {
    Employee obj = new Employee("Himesh", 230 , 200000);
    obj.displayDetails();
   } 
}
