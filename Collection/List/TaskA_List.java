/*
Problem Statement: Restaurant Management System

You are tasked with creating a simple Restaurant Management System in Java that allows customers to view the menu, create their Oreders, and calculate the total cost of their Oreders. The program should be menu-driven and use ArrayList, methods, and classes to simulate real-world scenarios in a restaurant.--------------> ok

Requirements:

1. Create a class named 'MenuItem' to represent an item on the restaurant's menu. Each item should have attributes for its name and price.---------------------------> OK

2. Create a class named 'RestaurantMenu' to represent the restaurant's menu. This class should have an ArrayList to store instances of 'MenuItem'. The constructor of 'RestaurantMenu' should initialize the menu items with at least four predefined items (e.g., burger, pizza, salad, pasta) with their respective names and prices.---------->  Ok

3. Create a class named 'Oreder' to represent a customer's Oreder. This class should have an ArrayList to store the items the customer has Oredered. -------------------> OK

4. Implement a method in the 'Oreder' class to add a selected menu item to the Oreder. --------------> OK

5. Implement a method in the 'Oreder' class to calculate the total cost of the Oreder based on the prices of the selected items. -------------------->  OK

6. In the main program ('RestaurantApp'), provide a menu-driven interface for the customer:

   - Display the following options:
     1. Display Menu
     2. Add Item to Oreder  ----------------------> OK
     3. View Oreder
     4. Exit

   - If the user chooses to display the menu, the program should iterate through the 'RestaurantMenu''s items and display each item's name and price.

   - If the user chooses to add an item to their Oreder, display the menu items and allow them to select an item by its number. Add the selected item to the Oreder.

   - If the user chooses to view their Oreder, display the items in their Oreder along with the total cost.

   - If the user chooses to exit, display a thank-you message and terminate the program.

Note: Handle invalid inputs gracefully, such as entering a wrong menu item number or choosing an option outside the provided range.

Deliverables:

Provide the complete Java code for the Restaurant Management System as described in the problem statement. Additionally, provide sample input and output scenarios to demonstrate the functionality of the program.
    
*/

import java.util.ArrayList;
import java.util.Scanner;

class MenuItem{
    private String name;
    private double price;

    public MenuItem(String name , double price){
        this.name = name;
        this.price = price;
    }
    
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

    public void display(){
        System.out.println("The name of this Item is :- "+name);
        System.out.println("The price of this Item is :- "+price);
    }
}

class RestaurantMenu{
    private ArrayList<MenuItem> menuItems;

    public RestaurantMenu(){
        menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("Burger", 110));
        menuItems.add(new MenuItem("Pizza", 250));
        menuItems.add(new MenuItem("salad", 80));
        menuItems.add(new MenuItem("pasta", 170));
    }

    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }

    public void displayMenuItems(){
        int i =1;
        for(MenuItem obj : menuItems){
            System.out.println(i++ +". "+obj.getName()+ " ----------->  "+obj.getPrice() + " Rupee.");
        }
    }
}

class Oreder{
    ArrayList<MenuItem> orederItems;
    // private int quntity;

    public Oreder(){
        orederItems = new ArrayList<>();
    }

    public void addItems(MenuItem items){
        orederItems.add(items);
        System.out.println(items.getName() + " is added in your oreder.");
    }

    public void displayOreder(){
        if(orederItems.size() == 0){
            System.out.println("Your oreder is empty.");
        }
        else{
            for(MenuItem item: orederItems){
                System.out.println(item.getName() + "------>"+item.getPrice()+" Rupee.");
            }
            System.out.println("The total cost of your oreder is :- "+countTotal());
        }
    }

    public double countTotal(){
        double total = 0;
        for(MenuItem item: orederItems){
            total += item.getPrice();
        }
        return total;
    }
}

public class TaskA_List {
    public static void main(String[] args) {
        RestaurantMenu menu = new RestaurantMenu();
        Oreder obj = new Oreder();

        Scanner sc = new Scanner(System.in);
        int choice;    
        do {
            System.out.println("Welcome to Apna Restarunt :- ");
            System.out.println("1----------------------------> Display Menu Items");
            System.out.println("2----------------------------> Add items in your order");
            System.out.println("3----------------------------> view your order");
            System.out.println("4----------------------------> Exit");
            System.out.println("Please select the option :- ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Our Hotel Menu is show in below :- ");
                    menu.displayMenuItems(); 
                    System.out.println("\n\n\n\n");
                    break;

                case 2:
                    System.out.println("Enter the number of items if you want :- ");
                    int itemNumber = sc.nextInt();
                    if (itemNumber > 0 && itemNumber <= menu.getMenuItems().size()) {
                        MenuItem iname = menu.getMenuItems().get(itemNumber - 1);
                        obj.addItems(iname);
                    } else{
                        System.out.println("Invalid item number.");
                    }
                    System.out.println("\n\n\n\n");
                    break;
                    
                case 3:
                    obj.displayOreder();
                    System.out.println("\n\n\n\n");
                    break;

                case 4:
                    System.out.println("Thank you for visiting Apna Hotel , Have a good day sir.....");
                    break;
                
                default:
                    System.out.println("Invalid option!!!");
                    break;
            }    
        } while (choice != 4);
        sc.close();
    }
}