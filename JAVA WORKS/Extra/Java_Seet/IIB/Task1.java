// Scenario 1: Employee Database
// In an employee database system, create a class called "Employee" with an instance initializer block that initializes a static database connection. The block runs whenever an object of the "Employee" class is created.

class Employee {
    private String databasename;
    {
        databasename = "SQL";
    }
    public String database_system(String databasename){
        return databasename;
    }
}
public class Task1 {
    public static void main(String[] args) {
        Employee  e = new Employee();
        System.out.println(e.database_system("My SQL"));
    }
}