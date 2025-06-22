// 5. Static Members in Multilevel Inheritance:
//    - Problem Statement: Create a multilevel inheritance structure with classes 'Company', 'Department', and 'Employee'. The 'Company' class should have a static attribute 'companyName' and a method 'showCompany()'. The 'Department' class should add 'departmentName', and the 'Employee' class should add 'employeeName' and 'employeeID'. Ensure proper initialization and use static members effectively.

class Company {
    static String companyName;

    static void showCompany() {
        System.out.println("Company Name: " + companyName);
    }
}

class Department extends Company {
    String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }
}

class Employee extends Department {
    String employeeName;
    int employeeID;

    Employee(String employeeName, int employeeID) {
        super("IT");
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    void displayEmployeeInfo() {
        showCompany();
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + departmentName);
    }
}

public class Task5 {
    public static void main(String[] args) {
        Company.companyName = "Royal 2.o";
        Employee emp = new Employee("Dhruv", 001);

        emp.displayEmployeeInfo();
    }    
}
