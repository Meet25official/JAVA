// //Scenario 9: Shopping Cart System
// //Develop an abstract class called "CartItem" with abstract methods like "calculatePrice" and "displayDetails." Implement derived classes like "ElectronicsItem" and "ClothingItem" that provide specific implementations for these abstract methods.

abstract class CartItem{
    private String name;
    private double price;

    public CartItem(String name , double price){
        this.name = name;
        this.price = price;
    }

    abstract void calculatePrice();
    abstract void displayDetails();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class ElectronicsItem extends CartItem{
    public ElectronicsItem(String name , double price){
        super(name, price);
    }

    @Override
    public void displayDetails(){
        System.out.println("The name of this electronics item is :- "+super.getName());
    }
    @Override
    public void calculatePrice(){
        System.out.println("The total price of this electronics item is :- "+super.getPrice());
    }
}

class ClothingItem extends CartItem{
    public ClothingItem(String name , double price){
        super(name, price);
    }

    @Override
    public void displayDetails(){
        System.out.println("The name of this Clothing item is :- "+super.getName());
    }
    @Override
    public void calculatePrice(){
        System.out.println("The total price of this Clothing item is :- "+super.getPrice());
    }
}

public class Task9 {
    public static void main(String[] args) {
        ElectronicsItem obj1 = new ElectronicsItem("TV", 8500);
        ClothingItem obj2 = new ClothingItem("Paint", 999);
        
        obj1.displayDetails();
        obj1.calculatePrice();

        obj2.displayDetails();
        obj2.calculatePrice();
    }
}
