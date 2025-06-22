//Scenario 7: Social Media User Connections
//Design a social media system where a user can have multiple connections or friends. The user class contains a list of user objects, representing an aggregation relationship.

import java.util.Scanner;

class Instagram{
    private String name;
    private int followers;
    private int post;

    public Instagram(String name , int followers , int post){
        this.name = name;
        this.followers = followers;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public void display(){
        System.out.println("The Account name of this user is :- "+name);
        System.out.println("The total followers of this accont is :- "+followers);
        System.out.println("The total post of this account is :- "+post);
        System.out.println("--------------------------------------------------------------");
    }
}

class User{
    Instagram id[];
    int count;

    public User(int capacity){
        id = new Instagram[capacity];
        count = 0;
    }

    public void addUser(String name , int followers ,int post){
        if(count < id.length){
            id[count++] = new Instagram(name, followers,  post);
            System.out.println("The Account id added succesfully.");
        }
        else{
            System.out.println("The capacity is full.");
        }
    }

    public void removeUser(String name){
        for (int i = 0; i < count; i++) {
            if(id[i].getName().equals(name)){
                for (int j = i; j < count-1; j++) {
                    id[j] = id[j+1];
                }
                count--;
                System.out.println("The Account id remove successfully.");
                return;
            }
            else{
                System.out.println("The id is not in User.");
            }
        }
    }
    public void updateCource(String name){
        for (int i = 0; i < count; i++) {
            if(id[i].getName().equals(name)){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1------------->Name");
                    System.out.println("2------------->Followers");
                    System.out.println("3------------->Post");
                    System.out.println("0------------->exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch(choice){
                        case 1: System.out.println("Enter new Name :- ");
                                sc.nextLine();
                                id[i].setName(sc.nextLine());
                                break;
                        
                        case 2: System.out.println("Enter new followers :- ");
                                id[i].setFollowers(sc.nextInt());
                                break;
                        
                        case 3: System.out.println("Enter new number of Post:- ");
                                id[i].setPost(sc.nextInt());
                                break; 

                        case 0: break;  
                        default:System.out.println("Invailid Choice!!!");
                            break;     
                    }
                } while(choice != 0);
                System.out.println("id details update succesfully");
                return;
            }
        }
    }

    public void displayAll(){
        for (int i = 0; i < count; i++) {
            id[i].display();
            System.out.println("-------------------------------------------------");
        }
    }
}

public class Task7 {
    public static void main(String[] args) {
        User obj = new User(10);

        obj.addUser("Himesh Patel", 190, 2);
        obj.addUser("Jeel Patel", 270, 5);
        obj.addUser("Maan Patel", 150, 9);
        obj.addUser("MeetSarvaiya", 890, 45);

        obj.displayAll();

        obj.removeUser("Maan Patel");
        obj.displayAll();

        obj.updateCource("Jeel Patel");
        obj.displayAll();
    }
}