// Scenario 7: University Staff Hierarchy
// Develop a university staff hierarchy with a base class called "Staff" and derived classes like "Professor," "AdminStaff," and "TechnicalStaff." The base class can include attributes like name and salary, while the derived classes can have additional attributes based on their roles.

class Staff {
    String name;
    double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Professor extends Staff {
    String department;

    public Professor(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class AdminStaff extends Staff {
    String role;

    public AdminStaff(String name, double salary, String role) {
        super(name, salary);
        this.role = role;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: " + role);
    }
}

class TechnicalStaff extends Staff {
    String specialization;

    public TechnicalStaff(String name, double salary, String specialization) {
        super(name, salary);
        this.specialization = specialization;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

public class Task7 {
    public static void main(String[] args) {
        Professor prof = new Professor("John Doe", 80000.0, "Computer Science");
        AdminStaff admin = new AdminStaff("Jane Smith", 50000.0, "HR Manager");
        TechnicalStaff techStaff = new TechnicalStaff("Michael Johnson", 60000.0, "Network Administration");

        System.out.println("Professor:");
        prof.displayDetails();
        System.out.println();

        System.out.println("Admin Staff:");
        admin.displayDetails();
        System.out.println();

        System.out.println("Technical Staff:");
        techStaff.displayDetails();
    }
}