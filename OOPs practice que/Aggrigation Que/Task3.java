//Scenario 3: Employee Payroll System
// Develop an employee payroll system where an organization has multiple employees. The organization class contains a list of employee objects, representing an aggregation relationship.

import java.util.Scanner;

class Employee{
    private String name;
    private int eid;
    private double salary;

    public Employee(String name , int eid , double salary){
        this.name = name;
        this.eid = eid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void display(){
        System.out.println("The name of the employee :- "+name);
        System.out.println("The Employee Id is :- "+eid);
        System.out.println("The salary of this employee :-"+salary);
    }
}

class Organization{
    Employee employees[];
    int count;

    public Organization(int capacity){
        employees = new Employee[capacity];
        count = 0;
    }

    public void addemployees(String name , int eid , double salary){
        if(count < employees.length){
            employees[count++] = new Employee(name , eid , salary);
            System.out.println("employee added succesfull");
        }else{
            System.out.println("The capacity is full.");
        }
    }

    public void removeemployees(String name){
        for (int i = 0; i < count; i++) {
            if (employees[i].getName().equals(name)){
                for(int j = i; j< count-1 ; j++){
                    employees[j] = employees[j+1];
                }
                count--;
                System.out.println("employee removed succecfully.");
                return;
            }
            else{
                System.out.println("The employee is not found.");
            }
        }
    }

    public void updateemployees(String name){
        for (int i = 0; i < count; i++) {
            if (employees[i].getName().equals(name)){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1------------>Employee name");
                    System.out.println("2------------>Employee Id");
                    System.out.println("3------------>Salary");  
                    System.out.println("0------------>exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1: System.out.println("Enter the new Employee Name :- ");
                                sc.nextLine();
                                employees[i].setName(sc.nextLine());
                                break;
                        case 2: System.out.println("Enter the new Employee Id :- ");
                                employees[i].setEid(sc.nextInt());
                                break;
                        case 3: System.out.println("Enter the new Salary:- ");
                                employees[i].setSalary(sc.nextDouble());
                                break;    
                        case 0: break;            
                        default:System.out.println("Invailid Choice!!!");
                            break;
                    }
                } while (choice != 0);
                System.out.println("The Employee updated succesfully.");
                return;
            }
        }
    }

    public void displayAllemployees(){
        for (int i = 0; i < count; i++) {
            employees[i].display();
            System.out.println("------------------------------------------------------");
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Organization obj = new Organization(10);

        obj.addemployees("Himesh", 123, 340000);
        obj.addemployees("Meet", 456, 120000);
        obj.addemployees("Dhruv", 789, 234000);

        obj.displayAllemployees();
        obj.removeemployees("Dhruv");
        obj.displayAllemployees();

        obj.updateemployees("Meet");
        obj.displayAllemployees();
    } 
}