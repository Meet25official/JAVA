class Address {
    private String city;
    private String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    void getAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}

class Employee {
    private int id;
    private String name;
    private Address address;    //Aggregation
    private double salary;
    private String designation;

    public Employee(int id, String name, Address address, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.designation = designation;
    }

    void displayEmployeeDetails(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        address.getAddress();
        System.out.println("Salary: " + String.format("%.0f", salary));
        System.out.println("Designation: " + designation);
    }
}

public class Aggregation {
    public static void main(String[] args){
        Address address = new Address("Gandhinagar", "Gujarat");
        Employee dhruv = new Employee(421, "Dhruv Sharma", address, 10000000, "Senior Manager");

        dhruv.displayEmployeeDetails();
    }
}