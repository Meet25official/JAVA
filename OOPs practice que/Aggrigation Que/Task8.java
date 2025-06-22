//Scenario 8: Travel Itinerary Planner
// Create a travel itinerary planning system where a trip consists of multiple destinations. The trip class contains a list of destination objects, representing an aggregation relationship.

import java.util.Scanner;

class Destination{
    private String from;
    private String to;
    private int days;

    public Destination(String from , String to , int days){
        this.from = from;
        this.to = to;
        this.days = days;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    
    public void display(){
        System.out.println("The Trip is Start from :- "+from);
        System.out.println("The Trip is last destenation to :- "+to);
        System.out.println("The Trip is for :- "+days+" days.");
    }
}

class Trip{
    Destination destinations[];
    int count;

    public Trip(int capacity){
        destinations = new Destination[capacity];
        count = 0;
    }

    public void addDestination(String from , String to , int days){
        if(count < destinations.length){
            destinations[count++] = new Destination(from , to , days);
            System.out.println("Destination is added successfuly.");
        }
        else{
            System.out.println("The capacity is full.");
        }
    }

    public void removeDestination(String from){
        for (int i = 0; i < count; i++) {
            if(destinations[i].getFrom().equals(from)){
                for(int j = i; j < count-1; j++) {
                    destinations[j] = destinations[j+1];
                }  
                count--;
                System.out.println("The Destination removed succesfuly.");
                return;
            }
            else{
                System.out.println("The Destination cannot find.");
            }
        }
    }

    public void updateDestination(String from){
        for(int i = 0; i < count; i++) {
            if(destinations[i].getFrom().equals(from)){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1-------------------------------------->from");
                    System.out.println("2-------------------------------------->to");
                    System.out.println("3-------------------------------------->days");
                    System.out.println("0-------------------------------------->Exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch(choice){
                        case 1: System.out.println("Enter the new Destination :- ");
                                sc.nextLine();
                                destinations[i].setFrom(sc.nextLine());
                                break;
                 
                        case 2: System.out.println("Enter the new Last Destination :- ");
                                sc.nextLine();        
                                destinations[i].setTo(sc.nextLine());
                                break;
                        
                        case 3: System.out.println("Enter the new days :- ");
                                destinations[i].setDays(sc.nextInt());
                                // sc.close();
                                break;
                        case 0: break;
                        
                        default: System.out.println("Enter the vailid choice!!!");
                            break;
                    }
                }while(choice != 0);
                System.out.println("Destination update succesfuly.");
                return;
            } 
        }
    }
    public void displayAll(){
        for (int i = 0; i < count; i++) {
            destinations[i].display();
        }
    }
}


public class Task8 {
    public static void main(String[] args) {
        Trip obj = new Trip(10);

        obj.addDestination("Ahmdabad", "Manali", 10);
        obj.addDestination("Mumbai", "Shimla", 8);
        obj.addDestination("Kalol", "Dwaraka", 5);
        obj.addDestination("Katch", "Mount Abu", 3);
        obj.addDestination("Delhi", "Kanyakumari", 15);
        
        obj.displayAll();

        obj.removeDestination("Mumbai");
        obj.displayAll();

        obj.updateDestination("Kalol");
        obj.displayAll();
    }
}