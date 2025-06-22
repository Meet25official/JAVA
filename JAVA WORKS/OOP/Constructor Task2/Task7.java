// 7. Employee Class: Implement an `Employee` class with a constructor to store an employee's name, employee ID, and salary.

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
}
public class Task7 {
    public static void main(String[] args) {
        Employee emp = new Employee("meet", 123456, 50000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Salary: $" + emp.getSalary());
    }
}
