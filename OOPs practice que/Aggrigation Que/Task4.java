//Scenario 4: Online Shopping Cart
//Design an online shopping cart system where a shopping cart contains multiple items. The shopping cart class contains a list of item objects, representing an aggregation relationship.

import java.util.Scanner;

class ShoppingCart{
    private String name;
    private double price;
    private int quntity;
    
    public ShoppingCart(int quntity , String name , double price){
        this.name = name;
        this.price = price;
        this.quntity = quntity;
    }
    public int getQuntity(){
        return quntity;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setQuntity(int qun){
        this.quntity = qun;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setPrice(double p){
        this.price = p;
    }
    public void display(){
        System.out.println("Name of the Item    :- "+name);
        System.out.println("Price of the Item   :- "+price);
        System.out.println("Quntity of the Item :- "+quntity);
    }
}

class Cart{
    ShoppingCart items[];
    int count;

    public Cart(int capacity){
        items = new ShoppingCart[capacity];
        count = 0;
    }

    public void addItems(int quntity , String name , double price){
        if(count < items.length){
            items[count++] = new ShoppingCart(quntity , name , price);
            System.out.println("Item added succesfull");
        }else{
            System.out.println("The capacity is full.");
        }
    }

    public void removeItems(String name){
        for (int i = 0; i < count; i++) {
            if (items[i].getName().equals(name)){
                for(int j = i; j< count-1 ; j++){
                    items[j] = items[j+1];
                }
                count--;
                System.out.println("Item removed succecfully.");
                return;
            }
            else{
                System.out.println("The Item is not available in this Cart.");
            }
        }
    }

    public void updateItems(String name){
        for (int i = 0; i < count; i++) {
            if (items[i].getName().equals(name)){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1------------>Item name");
                    System.out.println("2------------>Item price");
                    System.out.println("3------------>Quantity");  
                    System.out.println("0------------>exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1: System.out.println("Enter the new Item Name :- ");
                                sc.nextLine();
                                items[i].setName(sc.nextLine());
                                break;
                        case 2: System.out.println("Enter the new Item price :- ");
                                items[i].setPrice(sc.nextDouble());
                                break;
                        case 3: System.out.println("Enter the new Quantity:- ");
                                items[i].setQuntity(sc.nextInt());
                                break;    
                        case 0: break;            
                        default:System.out.println("Invailid Choice!!!");
                            break;
                    }
                } while (choice != 0);
                System.out.println("The Item updated succesfully.");
                return;
            }
        }
    }

    public void displayAllItems(){
        for (int i = 0; i < count; i++) {
            items[i].display();
            System.out.println("------------------------------------------------------");
        }
    }
}
public class Task4 {
    public static void main(String[] args) {
        Cart obj = new Cart(10);
        obj.addItems(3, "Paint", 699);
        obj.addItems(5, "Shirt", 450);
        obj.addItems(2, "Shoes", 890);

        obj.displayAllItems();
        obj.removeItems("Shirt");

        obj.displayAllItems();

        obj.updateItems("Paint");
        obj.displayAllItems();
    }
}