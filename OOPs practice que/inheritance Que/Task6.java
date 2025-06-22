//Scenario 6: Electronics Product Hierarchy
//Design an electronics product hierarchy with a base class called "Product" and derived classes like "Television," "Smartphone," and "Laptop." The base class can contain attributes like brand and price, while the derived classes can have specific features and functionalities.


class Product{
    private String c_name;
    private double price;

    public Product(String c_name , double price){
        this.c_name = c_name;
        this.price = price;
    }

    void display(){
        System.out.println("Product Company's name :- "+c_name);
        System.out.println("Product price :- "+price);
    }
}

class Television extends Product{
    private int size;

    public Television(String c_name , double price,int size ){
        super(c_name, price);
        this.size = size;
    }

    void displayTel(){
        super.display();
        System.out.println("The size of this Telivision is :- "+size+" inches");
    }
}

class Smartphone extends Product{
    private int memory;

    public Smartphone(String c_name , double price,int memory ){
        super(c_name, price);
        this.memory = memory;
    }

    void displayPhone(){
        super.display();
        System.out.println("The memory of this Smart Phone is  :- "+memory+" GB");
    }
}


class Laptop extends Product{
    private String model;

    public Laptop(String c_name , double price, String model){
        super(c_name, price);
        this.model = model;
    }

    void displayLaptop(){
        super.display();
        System.out.println("The model name of this laptop is :- "+model);
    }
}


public class Task6 {
    public static void main(String[] args) {
        Television obj = new Television("Onida", 8500.0, 32);
        Smartphone obj2 = new Smartphone("One Plus", 20000.0, 128);
        Laptop obj3 = new Laptop("Leanovo", 62300, "LAPTOP-5L3G6C1T");
        obj.displayTel();
        obj2.displayPhone();
        obj3.displayLaptop();
    }
}
