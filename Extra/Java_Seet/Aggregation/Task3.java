// Scenario 3: Employee Payroll System
// Develop an employee payroll system where an organization has multiple employees. The organization class contains a list of employee objects, representing an aggregation relationship.

class Employee {
    String name;
    String id;
    double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", id='" + id + '\'' + ", salary=" + salary;
    }
}

class Organization {
    private Employee[] employees;
    private int count;

    public Organization(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Organization is full, cannot add more employees.");
        }
    }

    public void printEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < count; i++) {
            totalSalary += employees[i].salary;
        }
        return totalSalary;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Organization org = new Organization(10);

        Employee emp1 = new Employee("abc", "E001", 50000);
        Employee emp2 = new Employee("xyz", "E002", 60000);
        Employee emp3 = new Employee("pqr", "E003", 55000);

        org.addEmployee(emp1);
        org.addEmployee(emp2);
        org.addEmployee(emp3);

        System.out.println("Employees in the organization:");
        org.printEmployees();

        double totalSalary = org.calculateTotalSalary();
        System.out.println("Total salary of all employees: $" + totalSalary);
    }
}

