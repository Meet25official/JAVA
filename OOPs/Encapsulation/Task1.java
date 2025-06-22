//Scenario 1: Vehicle Manufacturing
// In a vehicle manufacturing system, encapsulate the internal details of a "Car" class, such as engine specifications and manufacturing processes, to protect sensitive information and provide a controlled interface for interacting with the car.

class Car{
    private String name;
    private int hp;
    private int milage;

    public Car(String name , int hp , int milage ){
        this.name = name;
        this.hp = hp;
        this.milage = milage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public void manufacturing(){
        System.out.println("The car name is  :- "+name);
        System.out.println("The car manufatering is very cleveness.");
    }

    public void  specifications(){
        System.out.println("The specialization of this car is horce power engine :- "+hp);
        System.out.println("The Engine is very Strong and milage of this car is :- "+milage);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Car obj = new Car("Swift", 300, 34);

        System.out.println("Name :- "+obj.getName());
        System.out.println("Horce Power :- "+obj.getHp());
        System.out.println("Milage :- "+obj.getMilage());
        
        obj.manufacturing();
        obj.specifications();
    }
}