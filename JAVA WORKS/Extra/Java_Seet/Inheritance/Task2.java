// Scenario 2: Employee Hierarchy
// Create an employee hierarchy with a base class called "Employee" and derived classes like "Manager," "Engineer," and "Intern." The base class can contain attributes like name and employee ID, while the derived classes can have additional attributes specific to their roles.

class Employee {
    protected String name;
    protected String employeeID;

    public Employee(String name, String employeeID){
        this.name = name;
        this.employeeID = employeeID;
    }
    public String getName() {
        return name;
    }
    public String getEmployeeID() {
        return employeeID;
    }
}

class Manager extends Employee {
    protected String department;
    public Manager(String name, String employeeID, String department) {
        super(name, employeeID);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}

class Engineer extends Employee {
    protected String project;
    public Engineer(String name, String employeeID, String project) {
        super(name, employeeID);
        this.project = project;
    }
    public String getProject() {
        return project;
    }
}

class Intern extends Employee {
    protected String school;
    public Intern(String name, String employeeID, String school) {
        super(name, employeeID);
        this.school = school;
    }
    public String getSchool() {
        return school;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Employee e = new Employee("Dhruv", "01");
        e.getEmployeeID();
    }
}