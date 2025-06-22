import java.util.Scanner;
class Employees{
    private int empId;
    private String name;
    private double salary;

    void ScanData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee id :- ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of employee:- ");
        name = sc.nextLine();
        System.out.println("Enter the salary of Employee :- ");
        salary = sc.nextInt();
        sc.close();
    }

    void DisplayData(){
        System.out.println("The Employee's Id is :- "+empId);
        System.out.println("The Employee's name is :- "+name);
        System.out.println("The Employee's salary is :- "+salary);
    }
}

public class Task1{
    public static void main(String[] args){
        Employees obj = new Employees();
        obj.ScanData();
        obj.DisplayData();
    }
}