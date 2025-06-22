//5. Static Members in Multilevel Inheritance:
// - Problem Statement: Create a multilevel inheritance structure with classes 'Company', 'Department', and 'Employee'. The 'Company' class should have a static attribute 'companyName' and a method 'showCompany()'. The 'Department' class should add 'departmentName', and the 'Employee' class should add 'employeeName' and 'employeeID'. Ensure proper initialization and use static members effectively.

class Company{
    private String companyName;
    
    public Company(String com){
        companyName = com;
    }

    public void showCompany(){
        System.out.println("The name of company is :- "+companyName);
    }
}

class Department extends Company{
    private String departmentName;

    public Department(String c,String dep){
        super(c);
        departmentName = dep;
    }

    public void showDepartment(){
        super.showCompany();
        System.out.println("The name of department is :- "+departmentName);
    }
}

class Employee extends Department{
    private String name;
    private int employeeID;

    public Employee(String co , String de , String name , int employeeID){
        super(co, de);
        this.name = name;
        this.employeeID = employeeID;
    }   

    public void displayInfo(){
        super.showDepartment();
        System.out.println("The name of employee is :- "+name);
        System.out.println("The employee Id is :- "+employeeID);
    }
}

public class Task5 {
   public static void main(String[] args) {
        Employee obj = new Employee("Torrent", "Tablet", "Anil Patel", 228);
        obj.displayInfo();
   } 
}