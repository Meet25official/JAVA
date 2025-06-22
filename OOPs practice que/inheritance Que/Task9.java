//Scenario 9: Online Shopping Cart
// Design an online shopping cart system with a base class called "CartItem" and derived classes like "ElectronicsItem," "ClothingItem," and "BookItem." Each derived class can have its own attributes and behaviors related to that type of item.

class CartItem{
    private String name;
    private double price;

    public CartItem(String name , double price){
        this.name = name;
        this.price = price;
    }

    public void display(){
        System.out.println("The name is :- "+name);
        System.out.println("The price is :- "+price);
    }
}

class ElectronicsItem extends CartItem{
    private String waranty;

    public ElectronicsItem(String name , double price , String waranty){
        super(name, price);
        this.waranty = waranty;
    }

    public void displayElectronic(){
        super.display();
        System.out.println("The Waranty Year of this Elecronics Items is :- "+waranty);
    }
}

class ClothingItem extends CartItem{
    private String type;

    public ClothingItem(String name , double price , String type){
        super(name, price);
        this.type = type;
    }

    public void displayCloths(){
        super.display();
        System.out.println("The type of this Cloths Items is :- "+type);
    }
}

class BookItem extends CartItem{
    private float pages;

    public BookItem(String name , double price , float pages){
        super(name, price);
        this.pages = pages;
    }

    public void displayBook(){
        super.display();
        System.out.println("The pages of this Books Items is :- "+pages);
    }
}

public class Task9 {
    public static void main(String[] args) {
        ElectronicsItem obj1 = new ElectronicsItem("TV", 8500, "7");
        ClothingItem obj2 = new ClothingItem("Paint", 1000, "Cotton");
        BookItem obj3 = new  BookItem("Ramayana", 120, 1700);

        obj1.displayElectronic();
        obj2.displayCloths();
        obj3.displayBook();
    }
}