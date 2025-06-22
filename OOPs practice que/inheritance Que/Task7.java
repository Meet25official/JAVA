//Scenario 7: University Staff Hierarchy
//Develop a university staff hierarchy with a base class called "Staff" and derived classes like "Professor," "AdminStaff," and "TechnicalStaff." The base class can include attributes like name and salary, while the derived classes can have additional attributes based on their roles.

class Staff{
    private String name;
    private double salary;

    public Staff(String name , double salary){
        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println("The name is :- "+name);
        System.out.println("The salary is :- "+salary);
    }
}

class Professor extends Staff{
    private String subject;

    public Professor(String name , double salary , String subject){
        super(name, salary);
        this.subject = subject;
    }

    public void displayProffeser(){
        super.display();
        System.out.println("The subject of this professer is :- "+subject);
    }
}

class AdminStaff extends Staff{
    private String quali;

    public AdminStaff(String name , double salary , String quali){
        super(name, salary);
        this.quali = quali;
    }

    public void displayAdmin(){
        super.display();
        System.out.println("The Qulification of this Admin Staff is :- "+quali);
    }
}

class TechnicalStaff extends Staff{
    private String laptop;

    public TechnicalStaff(String name , double salary , String laptop){
        super(name, salary);
        this.laptop = laptop;
    }

    public void displayTechnical(){
        super.display();
        System.out.println("The laptop of this Staff is :- "+laptop);
    }
}

public class Task7 {
    public static void main(String[] args) {
        Professor obj1 = new Professor("Himesh", 300000, "DBMS");
        AdminStaff obj2 = new AdminStaff("Dhruv", 100000, "B.E. CE");
        TechnicalStaff obj3 = new  TechnicalStaff("Meet", 120000, "leanovo");

        obj1.displayProffeser();
        obj2.displayAdmin();
        obj3.displayTechnical();
    }  
}