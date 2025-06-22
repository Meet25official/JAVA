package ecommerce;

import java.util.Scanner;

public class Cart {
    Product product[];
    int count;

    public Cart(int capacity){
        product = new Product[capacity];
        count = 0;
    }

    public void addCart(String name , double price){
        if(count < product.length){
            product[count++] = new Product(name, price);
            System.out.println("The product added in Cart succesful.");
        }
        else{
            System.out.println("The product can't added into this Cart.");
        }
    }

    public void removeCart(String name){
        for (int i = 0; i < count; i++) {
            if(product[i].getName().equals(name)){
                for (int j = i; j < count-1; j++) {
                    product[j] = product[j+1];
                }
                count--;
                System.out.println("The product remove succesfuly from the cart");
                return;
            }
            else{
                System.out.println(
                    "The product can't remove succesfuly from the cart.");
            }
        }
    }

    public void updateCart(String name){
        for (int i = 0; i < count; i++) {
           if(product[i].getName().equals(name)){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1------------------------------->Name");
                    System.out.println("2------------------------------->Price");
                    System.out.println("3------------------------------->Exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1: System.out.println("Enter the new product name :-");
                                sc.nextLine();
                                product[i].setName(sc.nextLine());
                                break;
                        
                        case 2: System.out.println("Enter the new product price :-");
                                product[i].setPrice(sc.nextDouble());
                                break;
                                
                        case 3: break;
                        
                        default: System.out.println("Invailid Choice!!!");
                                break;
                    }
                }while(choice != 3);
                System.out.println("The details updated succesfuly.");
                return;
           }
           else{
                System.out.println("The details not updated succesfuly.");
           }
        }
    }
    
    public void displayDetails(){
        for (int i = 0; i < count; i++) {
            product[i].display();
            System.out.println("-----------------------------------------------------------------");
        }
    }
}