//4. Constructor Chaining with Single Inheritance:
// - Problem Statement: Design a single inheritance relationship with classes 'Appliance' and 'WashingMachine'. The 'Appliance' class should have attributes 'power' and 'brand', and a constructor to initialize these attributes. The 'WashingMachine' class should add 'capacity' and utilize constructor chaining to initialize all attributes using 'this' and 'super'.

class Appliance{
    private double power;
    private String brand;

    public Appliance(double p , String b){
        power = p;
        brand = b;
    }
    public void dispay(){
        System.out.println("The power of this applieance is :- "+power+" kw");
        System.out.println("The brand of this applieance is :- "+brand);
    }
}

class WashingMachine extends Appliance{
    private int capacity;

    public WashingMachine(double po , String br , int cap){
        super(po, br);
        capacity = cap;
    }
    public void displayMashine(){
        super.dispay();
        System.out.println("The Capacity of the cloths is :- "+capacity+" kg");
    }

}

public class Task4 {
   public static void main(String[] args) {
        WashingMachine obj = new WashingMachine(100, "Semience", 8);
        obj.displayMashine();
   } 
}
