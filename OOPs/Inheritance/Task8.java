//8. Overloading Constructors in Multilevel Inheritance:
//- Problem Statement: Design a multilevel inheritance structure with classes 'Gadget', 'Phone', and 'Smartphone'. Each class should have multiple constructors to initialize different sets of attributes. Ensure constructor overloading and chaining using 'this' and 'super' keywords.

class Gadget{
    private String type;

    public Gadget(String t){
        type = t;
    }

    public void dispay(){
        System.out.println("The type of this Gadget is :- "+type);
    }
}

class Phone extends Gadget{
    private String brand;
    private int rom;
    private int ram;

    public Phone(String ty , String b , int r , int ra){
        super(ty);
        brand = b;
        rom = r;
        ram = ra;
    }

    public void displayInfo(){
        super.dispay();
        System.out.println("The brand of this phone is :- "+brand);
        System.out.println("The Ram of this Phone is :- "+ram);
        System.out.println("The Rom of this Phone is :- "+rom);
    }
}

class Smartphone extends Phone{
    private String name;
    private String features;
    private double price;

    public Smartphone(String t , String b , int r , int ro , String name , String features , double price ){
        super(t, b, ro, r);
        this.name = name;
        this.features = features;
        this.price = price;
    }

    public void displayMobile(){
        super.displayInfo();
        System.out.println("The name of this phone is :- "+name);
        System.out.println("The features of this phone is :- "+features);
        System.out.println("The price of this phone is :- "+price);
    }
}

public class Task8 {
    public static void main(String[] args) {
        Smartphone obj = new Smartphone("Phone", "One Plus", 8, 128, "OnePlus Nord CE 3 lite", "Touch screen Smart phone and Snapdragon processor", 20000);
        obj.displayMobile();
    }
}