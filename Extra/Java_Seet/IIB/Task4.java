// Scenario 2: Company Employee Management
// In a company employee management system, create a class called "Employee" with an instance initializer block that initializes an employee's access privileges and permissions when a new employee object is created.

class Employee {
    private String name;
    private int employeeId;
    private boolean isAdmin;

    {
        isAdmin = false;
    }

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Admin Privilege: " + isAdmin);
    }
}

public class Task4 {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Bob", 1001);
        Employee emp2 = new Employee("Jeck", 1002);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
